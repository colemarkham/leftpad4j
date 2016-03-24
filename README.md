## leftpad4j

String left pad re-implemented in Java.

## Build

```bash
$ mvn clean install
```

## Usage

```java
import static net.ccmcomputing.leftpad.LeftPad.leftpad;

leftpad("foo", 5)
// => "  foo"

leftpad("foobar", 6)
// => "foobar"

leftpad("1", 2, "0")
// => "01"
```
