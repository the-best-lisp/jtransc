package jtransc.annotation;

public class MethodBodyTest {
    static public void main(String[] args) {
        System.out.println(mymethod(777));
    }

    @JTranscMethodBody({
        "haxe", "return HaxeNatives.str('INT:$p0');"
    })
    static public native String mymethod(int arg);
}
