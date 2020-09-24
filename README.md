Description
-----------------------------------------------------
Accept a string as input and return a response indicating whether a word is a pyramid word. A word is a pyramid word if you can arrange the letters in increasing frequency, starting with 1 and continuing without gaps and without duplicates.

Examples

banana is a pyramid word because you have 1 'b', 2 'n's, and 3 'a's.

bandana is not a pyramid word because you have 1 'b' and 1 'd'.

Implementaton
-----------------------------------------------------
- Spring Boot
- Maven
- REST API

Function
-----------------------------------------------------
This web service just can identify the letter, if there is signs or numbers in the string you checked, then it is not a Pyramid word. And if there is Uppercase letter, it will be recongnized to lowercase letter automatically.

Install and Use
-----------------------------------------------------
1. Input command in your terminal:
git clone https://github.com/Janeliu123/PyramidWordCheck.git

2. Then enter PyramidWordCheck dir: cd PyramidWordCheck

3. start: mvn spring-boot:run

4. Use this URL in your browser:

   http://localhost:8080/check/checkPyramid?str={...} (fill the string that you want to check in {...})

5. Then you will get the result in your brower:

    "{...}: is Pyramid!!!" or

    "{...}: is not Pyramid!!!"

Author
-----------------------------------------------------
Name: Jiajia Liu

Email: jiajliuwork@gmail.com
