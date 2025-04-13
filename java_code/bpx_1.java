/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 */
import gnu.trove.list.array.TShortArrayList;
import java.util.HashMap;
import java.util.Random;

/*
 * Renamed from bpx
 */
public class bpx_1
implements bpz_1 {
    private final Random a = new Hx();
    private final char[] b;
    private final char[] c;
    private final HashMap<Character, char[]> d = new HashMap();
    private static final int e = 1;
    private static final int f = 20;
    private static final int g = 45;
    private static final int h = 30;
    private static final int i = 8;

    bpx_1() {
        short s2;
        int n;
        int n2;
        int n3;
        char[] cArray = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
        char[] cArray2 = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        short[] sArray = new short[]{9, 15, 8, 6, 6, 1};
        short[] sArray2 = new short[]{2, 2, 3, 2, 2, 2, 1, 1, 5, 3, 6, 2, 1, 6, 6, 6, 2, 1, 1, 1};
        this.a('c', new char[]{'_', 'h', 'l', 'r'}, new short[]{8, 3, 2, 2});
        this.a('g', new char[]{'_', 'l', 'n', 'r'}, new short[]{10, 2, 1, 2});
        this.a('l', new char[]{'_', 'l'}, new short[]{8, 1});
        this.a('m', new char[]{'_', 'm'}, new short[]{8, 1});
        this.a('n', new char[]{'_', 'n'}, new short[]{6, 1});
        this.a('p', new char[]{'_', 'h', 'l', 'r', 'p'}, new short[]{8, 2, 1, 3, 1});
        this.a('q', new char[]{'_', 'u'}, new short[]{0, 1});
        this.a('s', new char[]{'_', 'h', 'k', 'l', 'n', 'p', 'q', 'r', 's', 't'}, new short[]{15, 1, 1, 1, 2, 5, 1, 2, 10, 5});
        this.a('t', new char[]{'_', 'h', 'r', 't'}, new short[]{8, 3, 5, 1});
        this.a('a', new char[]{'t'}, new short[]{1});
        this.a('e', new char[]{'t', 'd'}, new short[]{2, 1});
        this.a('i', new char[0], new short[0]);
        this.a('o', new char[]{'t'}, new short[]{1});
        this.a('u', new char[]{'s', 't'}, new short[]{2, 1});
        this.a('y', new char[0], new short[0]);
        int n4 = 0;
        TShortArrayList tShortArrayList = new TShortArrayList();
        for (n3 = 0; n3 < cArray.length; ++n3) {
            n4 += sArray[n3];
        }
        for (n3 = 0; n3 < n4; n3 = (short)(n3 + 1)) {
            tShortArrayList.add((short)n3);
        }
        this.b = new char[n4];
        for (n3 = 0; n3 < cArray.length; ++n3) {
            for (n2 = 0; n2 < sArray[n3]; ++n2) {
                n = this.a.nextInt(tShortArrayList.size());
                s2 = tShortArrayList.get(n);
                this.b[s2] = cArray[n3];
                tShortArrayList.removeAt(n);
            }
        }
        n4 = 0;
        tShortArrayList = new TShortArrayList();
        for (n3 = 0; n3 < cArray2.length; ++n3) {
            n4 += sArray2[n3];
        }
        for (n3 = 0; n3 < n4; n3 = (short)(n3 + 1)) {
            tShortArrayList.add((short)n3);
        }
        this.c = new char[n4];
        for (n3 = 0; n3 < cArray2.length; ++n3) {
            for (n2 = 0; n2 < sArray2[n3]; ++n2) {
                n = this.a.nextInt(tShortArrayList.size());
                s2 = tShortArrayList.get(n);
                this.c[s2] = cArray2[n3];
                tShortArrayList.removeAt(n);
            }
        }
    }

    private void a(char c2, char[] cArray, short[] sArray) {
        int n;
        int n2 = 0;
        for (int k = 0; k < cArray.length; ++k) {
            n2 += sArray[k];
        }
        TShortArrayList tShortArrayList = new TShortArrayList();
        for (n = 0; n < n2; n = (short)(n + 1)) {
            tShortArrayList.add((short)n);
        }
        char[] cArray2 = new char[n2];
        for (n = 0; n < cArray.length; ++n) {
            for (int k = 0; k < sArray[n]; ++k) {
                int n3 = this.a.nextInt(tShortArrayList.size());
                short s2 = tShortArrayList.get(n3);
                cArray2[s2] = cArray[n];
                tShortArrayList.removeAt(n3);
            }
        }
        this.d.put(Character.valueOf(c2), cArray2);
    }

    private boolean a(int n) {
        return this.a.nextInt(100) < n;
    }

    private char c() {
        return this.b[this.a.nextInt(this.b.length)];
    }

    private char d() {
        return this.c[this.a.nextInt(this.c.length)];
    }

    private String e() {
        char[] cArray;
        Object object = "";
        char c2 = this.d();
        object = (String)object + c2;
        if (this.d.containsKey(Character.valueOf(c2)) && (cArray = this.d.get(Character.valueOf(c2))).length > 0) {
            object = (String)object + cArray[this.a.nextInt(cArray.length)];
        }
        object = (String)object + this.c();
        object = ((String)object).replace("_", "");
        return object;
    }

    private String f() {
        if (this.a(20)) {
            return ("" + this.c()).toUpperCase();
        }
        String string = this.e();
        if (string.charAt(0) == string.charAt(1)) {
            string = string.substring(1);
        }
        string = Cz.b(string);
        return string;
    }

    private String g() {
        Object object = "";
        for (int k = 0; k < 1 && this.a(45); ++k) {
            object = (String)object + this.e();
        }
        return object;
    }

    private String h() {
        char[] cArray;
        Object object = this.e();
        char[] cArray2 = ((String)object).toCharArray();
        char c2 = cArray2[cArray2.length - 1];
        if (this.d.containsKey(Character.valueOf(c2)) && this.a(30) && (cArray = this.d.get(Character.valueOf(c2))).length > 1) {
            object = (String)object + cArray[this.a.nextInt(cArray.length)];
        }
        return object;
    }

    private String i() {
        return this.f() + this.g() + this.h();
    }

    private String j() {
        if (this.a(8)) {
            return this.i() + "-" + this.i();
        }
        return this.i();
    }

    @Override
    public String a() {
        String string = this.j();
        if (!cby_2.a().a(string)) {
            return this.a();
        }
        return string;
    }

    @Override
    public void b() {
    }
}

