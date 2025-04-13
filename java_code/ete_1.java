/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eTe
 */
public class ete_1
extends esl_2 {
    private short a;
    private short b;
    private short c;
    private short d;

    ete_1() {
    }

    public ete_1(short s2, short s3, short s4, short s5) {
        this.a = s2;
        this.b = s3;
        this.c = s4;
        this.d = s5;
    }

    @Override
    public esn_2 a() {
        return esn_2.b;
    }

    @Override
    protected void a(abx_2 abx_22) {
        super.a(abx_22);
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.d);
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        this.a = byteBuffer.getShort();
        this.b = byteBuffer.getShort();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getShort();
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

    public short d() {
        return this.c;
    }

    public short e() {
        return this.d;
    }

    @Override
    public String toString() {
        return "TopologyUpdate{m_oldPatchId=" + this.d + ", m_patchX=" + this.a + ", m_patchY=" + this.b + ", m_patchId=" + this.c + "} " + super.toString();
    }
}

