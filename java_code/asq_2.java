/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;

/*
 * Renamed from asq
 */
class asq_2
extends aso_2 {
    final /* synthetic */ asp_2 f;

    asq_2(asp_2 asp_22) {
        this.f = asp_22;
    }

    @Override
    public DataOutputStream a(OutputStream outputStream) {
        this.d.a(outputStream);
        return this.d;
    }

    @Override
    public DataInputStream a(FileInputStream fileInputStream) {
        this.e.a(fileInputStream);
        return this.e;
    }

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
    }
}

