/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eSJ
 */
public class esj_2
extends esl_2 {
    private long a;
    private short b;
    private long c;

    esj_2() {
    }

    public esj_2(long l) {
        this.a = l;
    }

    @Override
    public esn_2 a() {
        return esn_2.e;
    }

    @Override
    protected void a(abx_2 abx_22) {
        super.a(abx_22);
        abx_22.a(this.a);
        abx_22.a(this.c);
        abx_22.a(this.b);
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        this.a = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.b = byteBuffer.getShort();
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

    public long d() {
        return this.c;
    }

    public void a(long l) {
        this.c = l;
    }

    public void a(short s2) {
        this.b = s2;
    }

    @Override
    public String toString() {
        return "BuildingEvolve{m_buildingUid=" + this.a + ", m_nextBuildingRefId=" + this.b + ", m_creationDate=" + this.c + "} " + super.toString();
    }
}

