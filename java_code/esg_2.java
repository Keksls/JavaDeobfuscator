/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eSG
 */
public class esg_2
extends esl_2 {
    private long a;
    private long b;
    private short c;
    private short d;
    private short e;

    esg_2() {
    }

    public esg_2(short s2, short s3, short s4) {
        this.c = s2;
        this.d = s3;
        this.e = s4;
    }

    @Override
    public esn_2 a() {
        return esn_2.c;
    }

    @Override
    protected void a(abx_2 abx_22) {
        super.a(abx_22);
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.d);
        abx_22.a(this.e);
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.getShort();
    }

    @Override
    public void a(esd_2 esd_22) {
        esd_22.a(this);
    }

    @Override
    public void a(ese_2 ese_22) {
        ese_22.a(this);
    }

    public long b() {
        return this.a;
    }

    public void a(long l) {
        this.a = l;
    }

    public long c() {
        return this.b;
    }

    public void b(long l) {
        this.b = l;
    }

    public short d() {
        return this.c;
    }

    public short e() {
        return this.d;
    }

    public short f() {
        return this.e;
    }

    @Override
    public String toString() {
        return "BuildingCreate{m_buildingRefId=" + this.c + ", m_buildingUid=" + this.a + ", m_creationDate=" + this.b + ", m_x=" + this.d + ", m_y=" + this.e + "} " + super.toString();
    }
}

