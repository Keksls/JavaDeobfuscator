/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.util.Optional;

/*
 * Renamed from ckS
 */
class cks_1 {
    private final long a;
    private final long b;
    private final xz_0 c;
    private final Optional<emn_0> d;
    private final oj_1 e;
    private final String f;

    cks_1(long l, long l2, xz_0 xz_02, Optional<emn_0> optional, oj_1 oj_12, String string) {
        this.a = l;
        this.b = l2;
        this.c = xz_02;
        this.d = optional;
        this.e = oj_12;
        this.f = string;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public xz_0 c() {
        return this.c;
    }

    public Optional<emn_0> d() {
        return this.d;
    }

    public oj_1 e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public static cks_1 a(DataInputStream dataInputStream) {
        Optional<emn_0> optional;
        Object object;
        long l = dataInputStream.readLong();
        long l2 = dataInputStream.readLong();
        xz_0 xz_02 = xz_0.a(dataInputStream.readInt());
        String string = dataInputStream.readUTF();
        if (dataInputStream.readBoolean()) {
            object = new byte[dataInputStream.readInt()];
            dataInputStream.readFully((byte[])object);
            optional = Optional.of(emT.a(object));
        } else {
            optional = Optional.empty();
        }
        object = oj_1.a(dataInputStream);
        return new cks_1(l, l2, xz_02, optional, (oj_1)object, string);
    }

    public String toString() {
        return "AccountInformation{m_community=" + this.c + ", m_adminInformation=" + this.d + "}";
    }
}

