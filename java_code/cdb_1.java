/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cdb
 */
public class cdb_1 {
    private final byte a;
    private final byte b;
    private aes[] c;
    private final ArrayList<aes> d = new ArrayList(10);

    public cdb_1(byte by, byte by2) {
        this.a = by;
        this.b = by2;
    }

    public cdb_1(cdb_1 cdb_12) {
        this.a = cdb_12.a;
        this.b = cdb_12.b;
        for (aes aes2 : cdb_12.d) {
            this.d.add(new aes(aes2));
        }
        this.c = cdb_12.c;
    }

    public int a() {
        return this.c.length / (this.a * this.b);
    }

    public byte b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    ArrayList<aes> d() {
        return this.d;
    }

    aes a(int n, int n2, int n3) {
        int n4 = n + (n2 + n3 * this.b) * this.a;
        return this.c[n4];
    }

    public void a(arf_1 arf_12) {
        int n = this.a * this.b;
        this.c = aet.a(this.d, n, arf_12);
    }
}

