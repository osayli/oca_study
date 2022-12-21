package Q041_to_Q060.q047;
class C1{

}


class C2 extends C1{

}


class C3 extends C2 {

    public static void main(String[] args) {

        C1 obj1=(C1)new C2(); //line 16
        C2 obj2=(C2)new C3(); //line 17
        C2 obj3=(C2)new C1(); //line 18
        C3 obj4=(C3)obj2;     //line 19
    }
}
//Which line throws ClassCastException?
//A.	line 18
//B.	line 17
//C.	line 19
//D.	line 16

/*
Answer is :A
Exception in thread "main" java.lang.ClassCastException: class new_version.Q41ToQ60.q047.C1 cannot be cast to class new_version.Q41ToQ60.q047.C2 (new_version.Q41ToQ60.q047.C1 and new_version.Q41ToQ60.q047.C2 are in unnamed module of loader 'app')
	at new_version.Q41ToQ60.q047.C3.main(C3.java:18)

 */