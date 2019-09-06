pipeline {
class Example { 
   static void main(String[] args) { 
      new File("E:/Example.txt").eachLine {  
         line -> println "line : $line"; 
      } 
   } 
}
}
