/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 */
import com.google.protobuf.ByteString;

/*
 * Renamed from eIO
 */
public class eio_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Infos \u00e0 passer", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eio_0() {
        this.M();
    }

    public eio_0 aD() {
        eio_0 eio_02 = new eio_0();
        eio_02.i = efc_0.eZ.a();
        eio_02.r = this.r;
        return eio_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean at() {
        return true;
    }

    @Override
    public void z() {
        this.r = null;
        super.z();
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(ByteString.copyFrom((byte[])this.r)));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.r = iq_02.c().toByteArray();
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

