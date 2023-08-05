package com.juaracoding.fundamental;

////// HARI KE-1 ////////

public class Main { // < nama kelas, untuk umum
    //ketik "m" + enter. langsung keluar ini ↓
    public static void main(String[] args) {
        // ↑️ nama methode, turunan kelasnya, biasanya semua file java harus punya "Main"
        //    Methode yg berparameter, contoh "main(String[] args)"
        //    "(String[] args)" sbg parameternya

        //Tulis "sout"  + enter. Maka muncul ini ↓
        System.out.println("Test");
    }
}


/* NOTES:
* Error:java: Source option 5 is no longer supported. Use 6 or later.
* ubah id pom.xml sesuaikan dgn versi Java terinstall di laptop
* <properties>
        <java.version>17</java.version>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>
    *
  Source: https://stackoverflow.com/questions/59685437/java-maven-project-source-option-5-is-no-longer-supported-use-6-or-later
* */


/* Kalo ada kesalahan Run aja ini di terminal
 * mvn -version
 * mvn clean compile
 * mvn compile
 *
 * ← ↑ → ↓ ↔ ↕
 * */