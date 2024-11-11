import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class dateclass
{
    public static void main(String args[])
    {
        LocalDate lc=LocalDate.now();
        LocalDateTime ldt=LocalDateTime.now();
        LocalTime lt=LocalTime.now();
        System.out.println("localdate is "+lc);
        System.out.println("localdatetime is"+ldt);
        System.out.println("localtime is"+lt);


    }
}























/*The `Date` and `Time` classes, along with related functionality like `java.time`, are part of the Java API (Application Programming Interface) because they provide standardized ways to handle date and time information across applications. Here's why:

### 1. **Abstraction and Simplification**
   Handling dates and times is complex due to leap years, time zones, daylight saving time, and other factors. The API abstracts these complexities, providing developers with easy-to-use classes and methods for common operations (e.g., getting the current date, formatting dates, or performing date arithmetic).

### 2. **Reusability**
   APIs provide reusable components. The `Date`, `Calendar`, and `java.time` (newer API introduced in Java 8) classes are part of the core Java libraries. Developers can use these prebuilt, tested functionalities to work with dates and times without having to write their own implementations.

### 3. **Standardization**
   The API follows international standards and conventions for date and time handling (ISO 8601). This ensures that Java applications handle date and time in a consistent and predictable way across different platforms and regions.

### 4. **Time Zones and Locale Support**
   The Java `Date`, `Calendar`, and `java.time` APIs provide support for time zones and locales, which is crucial for global applications. For example, `java.time.ZonedDateTime` allows you to handle date and time with time zone information.

### 5. **Backward Compatibility**
   Older classes like `java.util.Date` and `java.util.Calendar` were designed to handle basic date and time functionality. Later, the `java.time` package was introduced in Java 8 to address limitations of the older classes and provide more modern and robust functionality. Both old and new APIs coexist for backward compatibility.

### 6. **Efficiency**
   Using the built-in `Date` and `Time` API is much more efficient than writing your own code to handle different calendar systems, time zones, and formatting. The API is optimized for these operations and is part of the Java Standard Library, ensuring efficient date manipulation.

### Example of API Usage:
With just a few lines of code, you can get the current date and time, format it, or manipulate it:

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();        // Current date
        LocalTime currentTime = LocalTime.now();        // Current time
        LocalDateTime currentDateTime = LocalDateTime.now();  // Current date and time
        
        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current DateTime: " + currentDateTime);
    }
}
```

### In Summary:
The `Date` and `Time` classes are part of the Java API to provide developers with a reliable, consistent, and efficient way to work with date and time information. The API abstracts complex operations like timezone handling, date arithmetic, and formatting, enabling easier application development.


*/