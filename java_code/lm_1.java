/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.LittleEndianDataOutputStream
 */
import com.google.common.io.LittleEndianDataOutputStream;
import java.io.DataOutput;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;

/*
 * Renamed from LM
 */
public class lm_1 {
    private final kh_1 a;

    public lm_1(kh_1 kh_12) {
        this.a = kh_12;
    }

    public void a(DataOutput dataOutput) {
        ki_1 ki_12 = this.a.a();
        ll_1 ll_12 = new ll_1(ki_12);
        ll_12.a(dataOutput);
        kj_1 kj_12 = this.a.b();
        ln_1 ln_12 = new ln_1(kj_12);
        ln_12.a((DataOutput)(ki_12.a() ? new LittleEndianDataOutputStream((OutputStream)new DeflaterOutputStream(new ji_2(dataOutput))) : dataOutput));
    }
}

