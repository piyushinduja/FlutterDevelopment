import java.io.*;

class Sub {
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);

  int maths() throws IOException {
    int mathsScore = 0;
    System.out.println("Welcome to the Maths Quiz!!");

    // Question 1
    System.out.println("1) What is the symbol of pi? \n A. € \n B. π \n C. Ω \n D. ∞");
    String m1 = br.readLine();
    if (m1.equals("b") || m1.equals("B")) {
      mathsScore = mathsScore + 1;
    }

    // Question 2
    System.out.println("2) What is the greatest two digit number? \n A. 10 \n B. 90 \n C. 11 \n D. 99");
    String m2 = br.readLine();
    if (m2.equals("d") || m2.equals("D")) {
      mathsScore = mathsScore + 1;
    }

    // Question 3
    System.out.println("3) 19 + ……. = 42 \n A. 23 \n B. 61 \n C. 0 \n D. 42");
    String m3 = br.readLine();
    if (m3.equals("a") || m3.equals("A")) {
      mathsScore = mathsScore + 1;
    }

    return mathsScore;
  }

  int geography() throws IOException {
    int geoScore = 0;
    System.out.println("Welcome to the Geography Quiz!!");

    // Question 1
    System.out.println(
        "1) Which is the tallest mountain in the world? \n A. Mt. Everest \n B. Mt. Fuji \n C. Mt. Makalu \n D. Mt. Nanga Parbhat");
    String m1 = br.readLine();
    if (m1.equals("a") || m1.equals("A")) {
      geoScore = geoScore + 1;
    }

    // Question 2
    System.out.println("2) Which country has the highest population? \n A. India \n B. Russia \n C. China \n D. USA");
    String m2 = br.readLine();
    if (m2.equals("c") || m2.equals("C")) {
      geoScore = geoScore + 1;
    }

    // Question 3
    System.out.println(
        "3) Which is the latitude that runs through the centre of the Earth? \n A. Longitude \n B. Latitude \n C. Equator \n D. None of the above");
    String m3 = br.readLine();
    if (m3.equals("c") || m3.equals("C")) {
      geoScore = geoScore + 1;
    }

    return geoScore;
  }

  int science() throws IOException {
    int sciScore = 0;
    System.out.println("Welcome to the Science Quiz!!");

    // Question 1
    System.out.println("1) How many bones are in the human body? \n A. 206 \n B. 196 \n C. 216 \n D. 200");
    String m1 = br.readLine();
    if (m1.equals("a") || m1.equals("A")) {
      sciScore = sciScore + 1;
    }

    // Question 2
    System.out.println(
        "2) The concept of gravity was discovered by which famous physicist? \n A. Albert Einstein \n B. Issac Newton \n C. C.V.Raman \n D. Galileo Galilei");
    String m2 = br.readLine();
    if (m2.equals("b") || m2.equals("B")) {
      sciScore = sciScore + 1;
    }

    // Question 3
    System.out.println("3) What is the atomic number of carbon? \n A. 10 \n B. 16 \n C. 8 \n D. 6");
    String m3 = br.readLine();
    if (m3.equals("d") || m3.equals("D")) {
      sciScore = sciScore + 1;
    }

    return sciScore;
  }
}

class madTask1 {
  public static void main(String args[]) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int mathsScore = 0;
    int geoScore = 0;
    int sciScore = 0;
    int i = 1;
    Sub s1 = new Sub();

    while (i==1) {
      System.out.println("Choose one of the following topics \n m)Maths \n g)Geography \n s)Science \n e)Exit");
      String topic = br.readLine();

      switch (topic) {
        case ("m"):
          mathsScore = s1.maths();
          System.out.println("Maths Score is " + mathsScore + " out of 3");
          System.out.println("Correct Answers are: 1) b \t 2) d \t 3) a");
          break;
        case ("g"):
          geoScore = s1.geography();
          System.out.println("Geography Score is " + geoScore + " out of 3");
          System.out.println("Correct Answers are: 1) a \t 2) c \t 3) c");
          break;
        case ("s"):
          sciScore = s1.science();
          System.out.println("Science Score is " + sciScore + " out of 3");
          System.out.println("Correct Answers are: 1) a \t 2) b \t 3) d");
          break;
        case ("M"):
          mathsScore = s1.maths();
          System.out.println("Maths Score is " + mathsScore + " out of 3");
          System.out.println("Correct Answers are: 1) b \t 2) d \t 3) a");
          break;
        case ("G"):
          geoScore = s1.geography();
          System.out.println("Geography Score is " + geoScore + " out of 3");
          System.out.println("Correct Answers are: 1) a \t 2) c \t 3) c");
          break;
        case ("S"):
          sciScore = s1.science();
          System.out.println("Science Score is " + sciScore + " out of 3");
          System.out.println("Correct Answers are: 1) a \t 2) b \t 3) d");
          break;
        case ("e"):
          System.out.println("Thank You for taking the quiz. \n Your final scores are. \n Maths: " + mathsScore
              + "/3 \n Geography: " + geoScore + "/3 \n Science: " + sciScore + "/3");
          System.exit(0);
        case ("E"):
          System.out.println("Thank You for taking the quiz. \n Your final scores are. \n Maths: " + mathsScore
              + "/3 \n Geography: " + geoScore + "/3 \n Science: " + sciScore + "/3");
          System.exit(0);
      }
    }
  }
}