/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWT
 */
class cwt_0
extends bks_1 {
    final /* synthetic */ cWS z;

    public cwt_0(cWS cWS2) {
        this.z = cWS2;
        super(null);
    }

    @Override
    public Object b(String string) {
        if (string.equals("id")) {
            return -1;
        }
        if (string.equals("name")) {
            return bae.h().a("randomBreed", new Object[0]);
        }
        if (string.equals("maleFemalePortraitIllustration")) {
            try {
                String string2 = String.format(azs_0.a().a("breedPortraitIllustrationPath"), "aleat");
                String[] stringArray = new String[]{string2, string2};
                return stringArray;
            }
            catch (gm_0 gm_02) {
                a.error((Object)"PropertyException during getFieldValue for MALE_FEMALE_PORTRAIT_ILLUSTRATION_FIELD", (Throwable)gm_02);
            }
        }
        return null;
    }
}

