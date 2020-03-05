public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        if ( this.year == compared.year && this.month == compared.month &&
                this.day < compared.day ) {
            return true;
        }

        return false;
    }

    public void advance() {
    	this.day ++;

    	if( this.day > 30) {
    		this.day = 1;
    		this.month ++ ;
    		
    		if( this.month > 12) {
    			
    			this.month = 1;
    			this.year ++;
    		}	
    	}
    }
    
    public void advance(int numberOfDays) {
    	this.day += numberOfDays;
    	
    	while ( this.day > 30) {
    		this.day -= 30;
    		this.month ++;

    		if( this.month > 12) {
    			
    			this.month = 1;
    			this.year ++;	
    		}
    	}
    }

    MyDate afterNumberOfDays(int days) {
    	MyDate tmp = new MyDate ( this.day, this.month, this.year);
    	tmp.advance( days );
    	return tmp;
    }

    public MyDate (MyDate item) {
    	
    	this.day = item.day;
    	this.month = item.month;
    	this.year = item.year;
    }

    public int differenceInYears(MyDate comparedDate) {
    	
    	
    	MyDate tmpLow;
    	MyDate tmpHigh;
    	if (this.equals(comparedDate)) 
    		return 0;
    	
    	if ( this.earlier(comparedDate)) {
    		tmpLow = new MyDate ( this);
    		tmpHigh = new MyDate (comparedDate);
    		
    	}
    	
    	else {
    		tmpLow = new MyDate (comparedDate);
    		tmpHigh = new MyDate (this);
    		
    	}
    	
    	int difference = tmpHigh.year - tmpLow.year;
    	if( difference == 0)
    		return 0;
   
    	if ( tmpHigh.month < tmpLow.month) {
    		difference -- ;
    		return difference ;
    	}
    	
    	if ( ( tmpHigh.month == tmpLow.month) &&  ( tmpHigh.day < tmpLow.day) ) {
    		difference -- ;
    		return difference ;
    	}
  
    	return difference;
    }
}
  