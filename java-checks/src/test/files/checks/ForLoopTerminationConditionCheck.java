class A {
  void myMethod() {
    int j = 0;
  //for (    j = 1; j != 4; j += 2) {} // Noncompliant
    for (int i = 1; i != 4; i += 2) {} // Noncompliant
    for (int i =-1; i !=-4; i -= 2) {} // Noncompliant
    for (int i = 4; i != 1; i++)    {} // Noncompliant
    for (int i = 1; i != 4; i--)    {} // Noncompliant
    for (int i = 1; i != 4;    )    {} // Noncompliant
    for (int i = 4; i != 1; i -= -1){} // Noncompliant
    for (int i = 1; i != 4; j++)    {} // Noncompliant
    for (int i = 1; i != 4; j+=1)   {} // Noncompliant
    for (int i = 1; i != 4; j=j+1)  {} // Noncompliant
    for (int i = 1; i != 4; aMethod()) {}       // Noncompliant
    for (int i = 1; i != 4; i++)    { i = 5;    } // Noncompliant
    for (int i = 1; i != 4; i++)    { j = i+=1; } // Noncompliant
    for (int i = 1; i != 4; i++)    { -(i++);   } // Noncompliant
    for (int i = 1; i != 4; i++)    { j = -i; }
    for (int i = 1; i != 4; i++)    { j = 5;  }
    for (int i = 1; i != 4; i++)    { x(j++); }
    for (int i = 1; i != 4; i++)    {}
    for (int i = 4; i != 1; i--)    {}
    for (int i = 1; i != 4; i+=1)   {}
    for (int i = 4; i != 1; i-=1)   {}
    for (int i = 4; i != 1; i--)    {}
    for (int i = 1; i >= 4; i += 2) {}
    for (int i = 1; i >= 4; i += 2) {}
    for (int i = 1; i >  4; i += 2) {}
    for (int i = 4; i <  1; i -= 2) {}
    for (int i = 4; i <= 1; i -= 2) {}
    for (int i = 1; j != 4; i += 2) {}
    for (int i =+1; i != 4; i += -x){}
    for (         ; i != 4; i--)    {}
    for (int i = 1;       ; i++)    {}
    for (int i    ; i != 4; i++)    {}
    for (int i = 1; i != 4; i = x + 2)   {}
    for (int i = 1; i != 4; i += 2, i++) {}
    for (method() ; i != 4; i--)    {}
    for (double i = 1.; i != 4.; i += 2.) {}
    for (String s = "abc"; s.length() > 0; s = s.substring(1)) {}
  }
}