/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHB
 */
public class ahb_1 {
    private String a;
    private int b;
    private byte c;
    private short d;
    private int e;
    private long f;
    private double g;
    private float h;
    private String i;
    private final long j = 0L;

    public String a() {
        return this.a;
    }

    public void a(String string) {
        this.a = string;
    }

    public int b() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public byte c() {
        return this.c;
    }

    public void a(byte by) {
        this.c = by;
    }

    public short d() {
        return this.d;
    }

    public void a(short s2) {
        this.d = s2;
    }

    public int e() {
        return this.e;
    }

    public void b(int n) {
        this.e = n;
    }

    public long f() {
        return this.f;
    }

    public void a(long l) {
        this.f = l;
    }

    public double g() {
        return this.g;
    }

    public void a(double d2) {
        this.g = d2;
    }

    public float h() {
        return this.h;
    }

    public void a(float f2) {
        this.h = f2;
    }

    public String i() {
        return this.i;
    }

    public void b(String string) {
        this.i = string;
    }

    public String j() {
        String[] stringArray = this.a.split("/");
        return stringArray[0];
    }

    public String k() {
        String[] stringArray = this.a.split("/");
        if (stringArray.length > 1) {
            return stringArray[1];
        }
        return "";
    }

    public String l() {
        String[] stringArray = this.a.split("/");
        if (stringArray.length > 2) {
            return stringArray[2];
        }
        return "";
    }

    public long m() {
        return 0L;
    }

    public String toString() {
        return this.o();
    }

    public String n() {
        return this.a + " = " + this.o() + " (" + this.p() + ")";
    }

    public String o() {
        Object object = "";
        switch (this.b) {
            case 1: {
                object = (String)object + this.c;
                break;
            }
            case 2: {
                object = (String)object + this.d;
                break;
            }
            case 3: {
                object = (String)object + this.e;
                break;
            }
            case 4: {
                object = (String)object + this.f;
                break;
            }
            case 5: {
                object = (String)object + this.g;
                break;
            }
            case 6: {
                object = (String)object + this.h;
                break;
            }
            case 7: {
                object = (String)object + this.i;
            }
        }
        return object;
    }

    public String p() {
        Object object = "";
        switch (this.b) {
            case 1: {
                object = (String)object + "byte";
                break;
            }
            case 2: {
                object = (String)object + "short";
                break;
            }
            case 3: {
                object = (String)object + "int";
                break;
            }
            case 4: {
                object = (String)object + "long";
                break;
            }
            case 5: {
                object = (String)object + "double";
                break;
            }
            case 6: {
                object = (String)object + "float";
                break;
            }
            case 7: {
                object = (String)object + "string";
            }
        }
        return object;
    }
}

