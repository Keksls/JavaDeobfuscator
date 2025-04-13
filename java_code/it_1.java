/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.Random;

/*
 * Renamed from IT
 */
public class it_1
implements jg_1 {
    private final lu_2 a;

    public it_1(lu_2 lu_22) {
        this.a = lu_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(5);
        Random random = new Random();
        dataOutput.writeFloat(this.a.a()[0] + (random.nextFloat() - 0.5f) * this.a.e()[0]);
        dataOutput.writeFloat(this.a.a()[1] + (random.nextFloat() - 0.5f) * this.a.e()[1]);
        dataOutput.writeFloat(this.a.c()[0] + (random.nextFloat() - 0.5f) * this.a.f()[0]);
        dataOutput.writeFloat(this.a.c()[1] + (random.nextFloat() - 0.5f) * this.a.f()[1]);
        dataOutput.writeFloat(this.a.d()[0] * ((float)Math.PI / 180) + (random.nextFloat() - 0.5f) * this.a.g()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.d()[1] * ((float)Math.PI / 180) + (random.nextFloat() - 0.5f) * this.a.g()[1] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.e()[0]);
        dataOutput.writeFloat(this.a.e()[1]);
        dataOutput.writeFloat(this.a.f()[0]);
        dataOutput.writeFloat(this.a.f()[1]);
        dataOutput.writeFloat(this.a.g()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.g()[1] * ((float)Math.PI / 180));
    }
}

