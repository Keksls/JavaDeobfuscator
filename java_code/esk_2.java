/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eSK
 */
public class esk_2
extends esl_2 {
    private long a;
    private short b;
    private short c;

    esk_2() {
    }

    public esk_2(long l, short s2, short s3) {
        this.a = l;
        this.b = s2;
        this.c = s3;
    }

    @Override
    public esn_2 a() {
        return esn_2.j;
    }

    @Override
    protected void a(abx_2 abx_22) {
        super.a(abx_22);
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getShort();
        this.c = byteBuffer.getShort();
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

    public short c() {
        return this.b;
    }

    public short d() {
        return this.c;
    }

    @Override
    public String toString() {
        return "BuildingMove{m_buildingUid=" + this.a + ", m_x=" + this.b + ", m_y=" + this.c + "} " + super.toString();
    }
}

