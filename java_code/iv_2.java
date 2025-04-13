/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IV
 */
public class iv_2
implements jg_1 {
    private final lw_2 a;

    public iv_2(lw_2 lw_22) {
        this.a = lw_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(1);
        dataOutput.writeBoolean(this.a.w());
        dataOutput.writeShort((short)(this.a.e()[0] & 0xFFFF));
        dataOutput.writeShort((short)(this.a.e()[1] & 0xFFFF));
        dataOutput.writeShort((short)(this.a.f()[0] & 0xFFFF));
        dataOutput.writeShort((short)(this.a.f()[1] & 0xFFFF));
        dataOutput.writeFloat(Math.max(0.033f, (float)this.a.c()[0] / 1000.0f));
        dataOutput.writeFloat(Math.max(0.033f, (float)this.a.c()[1] / 1000.0f));
        dataOutput.writeFloat(Math.max(0.033f, (float)this.a.g()[0] / 1000.0f));
        dataOutput.writeFloat(Math.max(0.033f, (float)this.a.g()[1] / 1000.0f));
        dataOutput.writeFloat((float)this.a.d()[0] / 1000.0f);
        dataOutput.writeFloat((float)this.a.d()[1] / 1000.0f);
        dataOutput.writeFloat((float)this.a.h()[0] / 1000.0f);
        dataOutput.writeFloat((float)this.a.h()[1] / 1000.0f);
        dataOutput.writeFloat(this.a.i()[0]);
        dataOutput.writeFloat(this.a.i()[1]);
        dataOutput.writeFloat(this.a.k()[0]);
        dataOutput.writeFloat(this.a.k()[1]);
        dataOutput.writeFloat(this.a.m()[0]);
        dataOutput.writeFloat(this.a.m()[1]);
        dataOutput.writeFloat(this.a.j()[0]);
        dataOutput.writeFloat(this.a.j()[1]);
        dataOutput.writeFloat(this.a.l()[0]);
        dataOutput.writeFloat(this.a.l()[1]);
        dataOutput.writeFloat(this.a.n()[0]);
        dataOutput.writeFloat(this.a.n()[1]);
        dataOutput.writeFloat(this.a.o()[0] * 33.0f);
        dataOutput.writeFloat(this.a.o()[1] * 33.0f);
        dataOutput.writeFloat(this.a.q()[0] * 33.0f);
        dataOutput.writeFloat(this.a.q()[1] * 33.0f);
        dataOutput.writeFloat(this.a.s()[0] * 33.0f);
        dataOutput.writeFloat(this.a.s()[1] * 33.0f);
        dataOutput.writeFloat(this.a.p()[0] * 33.0f);
        dataOutput.writeFloat(this.a.p()[1] * 33.0f);
        dataOutput.writeFloat(this.a.r()[0] * 33.0f);
        dataOutput.writeFloat(this.a.r()[1] * 33.0f);
        dataOutput.writeFloat(this.a.t()[0] * 33.0f);
        dataOutput.writeFloat(this.a.t()[1] * 33.0f);
        dataOutput.writeFloat((float)this.a.u()[0] / 1000.0f);
        dataOutput.writeFloat((float)this.a.u()[1] / 1000.0f);
        dataOutput.writeFloat((float)this.a.v()[0] / 1000.0f);
        dataOutput.writeFloat((float)this.a.v()[1] / 1000.0f);
    }
}

