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

Steps
-----------------------------------------------------
1. Input command in your terminal:
git clone https://github.com/Janeliu123/PyramidWordCheck.git
2. start:
mvn spring-boot:run
3. Use this URL in your browser:
http://localhost:8080/check/checkPyramid?str={...}
(fill the string that you want to check in {...})
4. Then you will get the result in your brower:
"{...}: is Pyramid!!!" or
"{...}: is not Pyramid!!!"

Author
-----------------------------------------------------
Name: Jiajia Liu
Email: jiajliuwork@gmail.com
