# Alpha
Java Project involving creating and recording all future multimedia device items for OraclProduction.
## Installation
Clone the repository and run in Java >= 8
## Usage
1. First you build your interface. In this project the product.Item interface has been provided.
  ```java
  interface SomeRandomInterface {
    void someRandomEmptyMethod(int newValue);
  }
  ```
2. Implement the Interface in the desired class.
```java
//This is a Java Class containing Classy things
class SomeRandomClass implements SomeRandomInterface {
  int integer = 0;
  void someRandomEmptyMethod(int newValue){
    integer = newValue;
  }
}
```
3. Extend the abstract class product.Product on your custom class.
```java
//This is a Java Class containing Classy things
public class SomeRandomClass extends Product { 
  // Code goes here 
}
```
## Contributing
1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some awesome feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :|
## History
Sometime in 2015 Oracle came up with this mock project.
## Credits
* Oracle
* IntelliJ
* professor vanselow
