/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eTd
 */
public class etd_1
extends esl_2 {
    private short a;
    private short b;

    etd_1() {
    }

    public etd_1(short s2, short s3) {
        this.a = s2;
        this.b = s3;
    }

    @Override
    public esn_2 a() {
        return esn_2.a;
    }

    @Override
    protected void a(abx_2 abx_22) {
        super.a(abx_22);
        abx_22.a(this.a);
        abx_22.a(this.b);
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        this.a = byteBuffer.getShort();
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

    public short b() {
        return this.a;
    }

    public short c() {
        return this.b;
    }

    @Override
    public String toString() {
        return "TopologyCreate{m_partitionX=" + this.a + ", m_partitionY=" + this.b + "} " + super.toString();
    }
}

