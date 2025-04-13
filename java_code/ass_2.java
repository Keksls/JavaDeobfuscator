/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/*
 * Renamed from ass
 */
class ass_2
extends aso_2 {
    private final Deflater g = new Deflater(1);
    private final Inflater h = new Inflater();
    final /* synthetic */ asr_2 f;

    ass_2(asr_2 asr_22) {
        this.f = asr_22;
    }

    @Override
    public DataOutputStream a(OutputStream outputStream) {
        this.g.reset();
        this.d.a(new DeflaterOutputStream(outputStream, this.g));
        return this.d;
    }

    @Override
    public DataInputStream a(FileInputStream fileInputStream) {
        this.h.reset();
        this.e.a(new InflaterInputStream(fileInputStream, this.h));
        return this.e;
    }

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
    }
}

