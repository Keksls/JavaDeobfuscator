/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

final class cDn
extends cdm_0 {
    cDn(String string2) {
    }

    @Override
    protected amf_1 a(String string) {
        try {
            amh_1 amh_12 = new amh_1("snd", "ogg");
            amh_12.a(new arg_1(string));
            return amh_12;
        }
        catch (IOException iOException) {
            cdm_0.d.error((Object)"Impossible de charger le fichier de pak de son", (Throwable)iOException);
            return null;
        }
    }
}

