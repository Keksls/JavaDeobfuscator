/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Date;

/*
 * Renamed from flu
 */
public class flu_0 {
    private long a;
    private String b;
    private String c;
    private String d;
    private short e;
    private Date f;
    private Date g;

    public void a(abx_2 abx_22) {
        abx_22.a(this.a);
        byte[] byArray = Cz.a(this.b);
        abx_22.a((byte)byArray.length);
        abx_22.b(byArray);
        byte[] byArray2 = Cz.a(this.c);
        abx_22.a((byte)byArray2.length);
        abx_22.b(byArray2);
        byte[] byArray3 = Cz.a(this.d);
        abx_22.a((byte)byArray3.length);
        abx_22.b(byArray3);
        abx_22.a(this.e);
        abx_22.a(this.f.getTime());
        abx_22.a(this.g.getTime());
    }

    public void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray);
        this.b = Cz.a(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.c = Cz.a(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.d = Cz.a(byArray3);
        this.e = byteBuffer.getShort();
        this.f = new java.sql.Date(byteBuffer.getLong());
        this.g = new java.sql.Date(byteBuffer.getLong());
    }

    public long a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public short e() {
        return this.e;
    }

    public Date f() {
        return this.f;
    }

    public Date g() {
        return this.g;
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(String string) {
        this.b = string;
    }

    public void b(String string) {
        this.c = string;
    }

    public void c(String string) {
        this.d = string;
    }

    public void a(short s2) {
        this.e = s2;
    }

    public void a(Date date) {
        this.f = date;
    }

    public void b(Date date) {
        this.g = date;
    }

    public String toString() {
        return "PenalViewElement(m_ownerId=" + this.a() + ", m_characterName=" + this.b() + ", m_moderatorName=" + this.c() + ", m_reason=" + this.d() + ", m_sanctionId=" + this.e() + ", m_date=" + this.f() + ", m_deletionDate=" + this.g() + ")";
    }
}

