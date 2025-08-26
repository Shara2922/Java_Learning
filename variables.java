public class variables {

    public static void main(String[] args) {

        // ---------------------------
        // 1. String Length
        // ---------------------------
        String name = "Hello Shara, your score is 95";
        System.out.println("The name is: " + name);
        System.out.println("Length of the name is: " + name.length());

        System.out.println();

        // ---------------------------
        // 2. CharAt: Get character at specific index
        // ---------------------------
        String student = "Naeemi";
        char firstLetter = student.charAt(0);
        System.out.println("First letter: " + firstLetter);

        System.out.println();

        // ---------------------------
        // 3. String Concatenation
        // ---------------------------
        String first = "Hello, ";
        String second = "Diomede!";
        String third = "How are you?";
        String message = first.concat(second).concat(" ").concat(third);
        System.out.println("Concatenated message: " + message);

        System.out.println();

        // ---------------------------
        // 4. String Contains (True/False)
        // ---------------------------
        String sentence = "Java is powerful!";
        System.out.println(sentence.contains("power"));  // true
        System.out.println(sentence.contains("Python")); // false
        System.out.println(sentence.contains("Java"));   // true

        System.out.println();

        // ---------------------------
        // 5. startsWith and endsWith
        // ---------------------------
        String greeting = "Hello! Lucky";
        System.out.println(greeting.startsWith("Hello")); // true
        System.out.println(greeting.startsWith("Chitra")); // false

        System.out.println(greeting.endsWith("Hello")); // false
        System.out.println(greeting.endsWith("Lucky")); // true

        System.out.println();

        // ---------------------------
        // 6. equals() method
        // ---------------------------
        String a = "Neha Jain";
        String b = "Neh@ Jain";
        String c = "Neha Jain";
        System.out.println(a.equals(b)); // false
        System.out.println(a.equals(c)); // true

        System.out.println();

        // ---------------------------
        // 7. indexOf()
        // ---------------------------
        String text = "Cybersecurity is an excellent career option";
        System.out.println(text.indexOf('e'));        // first 'e'
        System.out.println(text.indexOf("Cyber"));    // index of "Cyber"
        System.out.println(text.indexOf('a'));        // first 'a'

        System.out.println();

        // ---------------------------
        // 8. isEmpty()
        // ---------------------------
        String glass1 = "";
        String glass2 = "Hello";
        String glass3 = " ";
        System.out.println("glass1 is empty: " + glass1.isEmpty()); // true
        System.out.println("glass2 is empty: " + glass2.isEmpty()); // false
        System.out.println("glass3 is empty: " + glass3.isEmpty()); // false (has a space)

        System.out.println();

        // ---------------------------
        // 9. replace() method
        // ---------------------------
        String fruit = "banana";
        System.out.println(fruit.replace('a', 'o')); // bonono

        String drinks = "sugar, tea, milk";
        System.out.println(drinks.replace("sugar", "honey")); // honey, tea, milk

        String tech = "Cybersecurity is an excellent career option";
        System.out.println(tech.replace("option", "choice")); // choice instead of option

        System.out.println();

        // ---------------------------
        // 10. substring() method
        // ---------------------------
        String email = "neha.jain@gmail.com";
        int atIndex = email.indexOf("@");
        String domain = email.substring(atIndex);
        System.out.println("Email domain: " + domain); // @gmail.com

        String fullname = "John Mayer";
        int space = fullname.indexOf(" ");
        String lastname = fullname.substring(space + 1);
        System.out.println("Last name: " + lastname); // Mayer

        String fullName2 = "Lucky Student";
        int endIndex = fullName2.indexOf("e");
        String partName = fullName2.substring(3, endIndex);
        System.out.println("Substring: " + partName);

        String title = "Java Class for beginners";
        int titleEnd = title.indexOf("i");
        String newTitle = title.substring(0, titleEnd);
        System.out.println("Updated title: " + newTitle);

        System.out.println();

        // ---------------------------
        // 11. toLowerCase() and Custom Example
        // ---------------------------
        String lowerExample = "Danish Student";
        System.out.println("Lowercase: " + lowerExample.toLowerCase());

        String fullStudent = "Danish Student";
        int spaceIndex = fullStudent.indexOf(" ");
        String firstName = fullStudent.substring(0, spaceIndex);
        String lastName = fullStudent.substring(spaceIndex + 1);
        lastName = lastName.toLowerCase();
        String result = firstName + " " + lastName;
        System.out.println("Original: " + fullStudent);
        System.out.println("Modified: " + result);

        System.out.println();

        // ---------------------------
        // 12. toUpperCase()
        // ---------------------------
        String myname = "hassan";
        System.out.println("Uppercase name: " + myname.toUpperCase());

        System.out.println();

        // ---------------------------
        // 13. trim(): removes leading and trailing spaces
        // ---------------------------
        String messy = "   Hello, how are you today?       ";
        System.out.println("Trimmed: [" + messy.trim() + "]");

        String messy2 = " Do I need to learn Java? ?? !!!!! ??";
        System.out.println("Trimmed: [" + messy2.trim() + "]");

        System.out.println();

        // ---------------------------
        // 14. contains()
        // ---------------------------
        String javaSentence = "Java review class";
        System.out.println(javaSentence.contains("python"));     // false
        System.out.println(javaSentence.contains("classroom"));  // false
        System.out.println(javaSentence.contains("Java"));       // true
    }
}