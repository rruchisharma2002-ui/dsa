"Kabhi-kabhi humein ek datatype ki value ko doosre datatype mein convert karna padta hai.
Isi ko broadly type conversion / type casting kehte hain."

TYPE CASTING:
type casting syntax =>
smallDatatype variable = (smallDatatype) value;

Agar hum large datatype → small datatype karna chahte hain, Java automatically allow nahi karta.
Example:
double a = 10.5;
int b = a;   // ERROR
❌ Error aayega.
Kyun?
Because double mein decimal ho sakta hai:10.5
Lekin int sirf whole number rakhta hai. Agar Java automatically kare: 10.5 → 10 to .5 lost ho jayega.
Isliye humein explicitly batana padta hai ki mujhe conversion karna hai.

Explicit Type Casting
Syntax:smallDatatype variable = (smallDatatype) value;
Example: double a = 10.5;
     int b = (int) a;
     System.out.println(b);
Output: 10
Yahan: (int) a ka matlab hai:  a ki value ko int mein convert karo.



TYPE CONVERSION:
int x = 100;

long y = x;

double z = y;

System.out.println(y);
System.out.println(z);

Type conversion ka simple meaning:

Ek datatype ki value ko automatically doosre compatible datatype mein convert kar dena.

Java mein jab small datatype → large datatype jaata hai, Java usually automatically convert kar deta hai.

Example
int a = 10;

double b = a;

System.out.println(b);

Output:

10.0