/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from aJn
 */
public class ajn_1 {
    private final InputStream a;
    private int b = 0;
    private String c = "info";
    private boolean d = false;
    private final MessageDigest e;

    public byte[] a() {
        return this.e.digest();
    }

    public void a(String string) {
        this.c = string;
    }

    public ajn_1(InputStream inputStream) {
        this.a = inputStream;
        try {
            this.e = MessageDigest.getInstance("SHA");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new InternalError(noSuchAlgorithmException.toString());
        }
    }

    public static ajo_1 a(InputStream inputStream) {
        return new ajn_1(inputStream).c();
    }

    public int b() {
        if (this.b == 0) {
            this.b = this.a.read();
            if (this.d) {
                this.e.update((byte)this.b);
            }
        }
        return this.b;
    }

    public ajo_1 c() {
        this.b = this.b();
        if (this.b == -1) {
            return null;
        }
        if (this.b >= 48 && this.b <= 57) {
            return this.d();
        }
        if (this.b == 105) {
            return this.e();
        }
        if (this.b == 108) {
            return this.f();
        }
        if (this.b == 100) {
            return this.g();
        }
        throw new ajq_1("Unknown indicator '" + this.b + "'");
    }

    public ajo_1 d() {
        int n = this.b();
        int n2 = n - 48;
        if (n2 < 0 || n2 > 9) {
            throw new ajq_1("Number expected, not '" + (char)n + "'");
        }
        this.b = 0;
        n = this.h();
        int n3 = n - 48;
        while (n3 >= 0 && n3 <= 9) {
            n2 = n2 * 10 + n3;
            n = this.h();
            n3 = n - 48;
        }
        if (n != 58) {
            throw new ajq_1("Colon expected, not '" + (char)n + "'");
        }
        return new ajo_1(this.a(n2));
    }

    public ajo_1 e() {
        int n = this.b();
        if (n != 105) {
            throw new ajq_1("Expected 'i', not '" + (char)n + "'");
        }
        this.b = 0;
        n = this.h();
        if (n == 48) {
            n = this.h();
            if (n == 101) {
                return new ajo_1(BigInteger.ZERO);
            }
            throw new ajq_1("'e' expected after zero, not '" + (char)n + "'");
        }
        char[] cArray = new char[256];
        int n2 = 0;
        if (n == 45) {
            n = this.h();
            if (n == 48) {
                throw new ajq_1("Negative zero not allowed");
            }
            cArray[n2] = (char)n;
            ++n2;
        }
        if (n < 49 || n > 57) {
            throw new ajq_1("Invalid Integer start '" + (char)n + "'");
        }
        cArray[n2] = (char)n;
        ++n2;
        n = this.h();
        int n3 = n - 48;
        while (n3 >= 0 && n3 <= 9) {
            cArray[n2] = (char)n;
            ++n2;
            n = this.h();
            n3 = n - 48;
        }
        if (n != 101) {
            throw new ajq_1("Integer should end with 'e'");
        }
        String string = new String(cArray, 0, n2);
        return new ajo_1(new BigInteger(string));
    }

    public ajo_1 f() {
        int n = this.b();
        if (n != 108) {
            throw new ajq_1("Expected 'l', not '" + (char)n + "'");
        }
        this.b = 0;
        ArrayList<ajo_1> arrayList = new ArrayList<ajo_1>();
        n = this.b();
        while (n != 101) {
            arrayList.add(this.c());
            n = this.b();
        }
        this.b = 0;
        return new ajo_1(arrayList);
    }

    public ajo_1 g() {
        int n = this.b();
        if (n != 100) {
            throw new ajq_1("Expected 'd', not '" + (char)n + "'");
        }
        this.b = 0;
        HashMap<String, ajo_1> hashMap = new HashMap<String, ajo_1>();
        n = this.b();
        while (n != 101) {
            String string = this.c().a();
            boolean bl = this.c.equals(string);
            if (bl) {
                this.d = true;
            }
            ajo_1 ajo_12 = this.c();
            hashMap.put(string, ajo_12);
            if (bl) {
                this.d = false;
            }
            n = this.b();
        }
        this.b = 0;
        return new ajo_1(hashMap);
    }

    private int h() {
        int n = this.a.read();
        if (n == -1) {
            throw new EOFException();
        }
        if (this.d) {
            this.e.update((byte)n);
        }
        return n;
    }

    private byte[] a(int n) {
        int n2;
        byte[] byArray = new byte[n];
        for (int k = 0; k < n; k += n2) {
            n2 = this.a.read(byArray, k, n - k);
            if (n2 != -1) continue;
            throw new EOFException();
        }
        if (this.d) {
            this.e.update(byArray, 0, n);
        }
        return byArray;
    }
}

