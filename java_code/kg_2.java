/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.LittleEndianDataInputStream
 */
import com.google.common.io.LittleEndianDataInputStream;
import java.io.DataInput;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;

/*
 * Renamed from Kg
 */
public class kg_2 {
    private final kh_1 a;

    public kg_2(kh_1 kh_12) {
        this.a = kh_12;
    }

    public void a(DataInput dataInput) {
        ki_1 ki_12 = this.a.a();
        kf_1 kf_12 = new kf_1(ki_12);
        kf_12.a(dataInput);
        kj_1 kj_12 = this.a.b();
        kh_2 kh_22 = new kh_2(kj_12);
        kh_22.a((DataInput)(ki_12.a() ? new LittleEndianDataInputStream((InputStream)new InflaterInputStream(new jh_2(dataInput))) : dataInput));
    }
}

