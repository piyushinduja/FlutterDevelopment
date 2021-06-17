import 'dart:io';

void main() {
  int mathsScore = 0;
  int geoScore = 0;
  int sciScore = 0;
  int i = 1;

  while (i == 1) {
    print(
        "Choose one of the following topics \n m)Maths \n g)Geography \n s)Science \n e)Exit");
    String? topic = stdin.readLineSync();

    switch (topic) {
      case ("m"):
        mathsScore = maths();
        print("Maths Score is $mathsScore out of 3");
        print("Correct Answers are: 1) b \t 2) d \t 3) a");
        break;
      case ("g"):
        geoScore = geography();
        print("Geography Score is $geoScore out of 3");
        print("Correct Answers are: 1) a \t 2) c \t 3) c");
        break;
      case ("s"):
        sciScore = science();
        print("Science Score is $sciScore out of 3");
        print("Correct Answers are: 1) a \t 2) b \t 3) d");
        break;
      case ("M"):
        mathsScore = maths();
        print("Maths Score is $mathsScore out of 3");
        print("Correct Answers are: 1) b \t 2) d \t 3) a");
        break;
      case ("G"):
        geoScore = geography();
        print("Geography Score is $geoScore out of 3");
        print("Correct Answers are: 1) a \t 2) c \t 3) c");
        break;
      case ("S"):
        sciScore = science();
        print("Science Score is $sciScore out of 3");
        print("Correct Answers are: 1) a \t 2) b \t 3) d");
        break;
      case ("e"):
        print(
            "Thank You for taking the quiz. \n Your final scores are. \n Maths: $mathsScore/3 \n Geography: $geoScore/3 \n Science: $sciScore/3");
        exit(0);
    }
  }
}

int maths() {
  int mathsScore = 0;
  print("Welcome to the Maths Quiz!!");

  //Question 1
  print("1) What is the symbol of pi? \n A. € \n B. π \n C. Ω \n D. ∞");
  String? m1 = stdin.readLineSync();
  if (m1 == "b" || m1 == "B") {
    mathsScore = mathsScore + 1;
  }

  //Question 2
  print(
      "2) What is the greatest two digit number? \n A. 10 \n B. 90 \n C. 11 \n D. 99");
  String? m2 = stdin.readLineSync();
  if (m2 == "d" || m2 == "D") {
    mathsScore = mathsScore + 1;
  }

  //Question 3
  print("3) 19 + ……. = 42 \n A. 23 \n B. 61 \n C. 0 \n D. 42");
  String? m3 = stdin.readLineSync();
  if (m3 == "a" || m3 == "A") {
    mathsScore = mathsScore + 1;
  }

  return mathsScore;
}

int geography() {
  int geoScore = 0;
  print("Welcome to the Geography Quiz!!");

  //Question 1
  print(
      "1) Which is the tallest mountain in the world? \n A. Mt. Everest \n B. Mt. Fuji \n C. Mt. Makalu \n D. Mt. Nanga Parbhat");
  String? m1 = stdin.readLineSync();
  if (m1 == "a" || m1 == "A") {
    geoScore = geoScore + 1;
  }

  //Question 2
  print(
      "2) Which country has the highest population? \n A. India \n B. Russia \n C. China \n D. USA");
  String? m2 = stdin.readLineSync();
  if (m2 == "c" || m2 == "C") {
    geoScore = geoScore + 1;
  }

  //Question 3
  print(
      "3) Which is the latitude that runs through the centre of the Earth? \n A. Longitude \n B. Latitude \n C. Equator \n D. None of the above");
  String? m3 = stdin.readLineSync();
  if (m3 == "c" || m3 == "C") {
    geoScore = geoScore + 1;
  }

  return geoScore;
}

int science() {
  int sciScore = 0;
  print("Welcome to the Science Quiz!!");

  //Question 1
  print(
      "1) How many bones are in the human body? \n A. 206 \n B. 196 \n C. 216 \n D. 200");
  String? m1 = stdin.readLineSync();
  if (m1 == "a" || m1 == "A") {
    sciScore = sciScore + 1;
  }

  //Question 2
  print(
      "2) The concept of gravity was discovered by which famous physicist? \n A. Albert Einstein \n B. Issac Newton \n C. C.V.Raman \n D. Galileo Galilei");
  String? m2 = stdin.readLineSync();
  if (m2 == "b" || m2 == "B") {
    sciScore = sciScore + 1;
  }

  //Question 3
  print(
      "3) What is the atomic number of carbon? \n A. 10 \n B. 16 \n C. 8 \n D. 6");
  String? m3 = stdin.readLineSync();
  if (m3 == "d" || m3 == "D") {
    sciScore = sciScore + 1;
  }

  return sciScore;
}

// int repeat(topic1) {
//
//       if (topic1 == "g" || topic1)
//   if (topic1 == "m" || topic1 == "M") {
//     int mScore = maths();
//     return mScore;
//   }
// }
