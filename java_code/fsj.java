/*
 * Decompiled with CFR 0.152.
 */
class fsj
extends fig_2 {
    final /* synthetic */ fsi a;

    fsj(fsi fsi2) {
        this.a = fsi2;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        return this.a.getPrefSize();
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        return new fjf_2(70, 50);
    }

    @Override
    public void a(fso fso2) {
        int n = fso2.getAppearance().getContentWidth();
        int n2 = fso2.getAppearance().getContentHeight();
        if (n <= 0 || n2 <= 0) {
            return;
        }
        if (!this.a.o) {
            return;
        }
        ays_2 ays_22 = this.a.k.a(this.a.getColorTextureWidth(), this.a.getColorTextureHeight(), "colorPickerTexture" + n + n2);
        this.a.setPixmap(new ayo_2(ays_22));
        this.a.b(this.a.getSliderTextureWidth(), this.a.getSliderTextureHeight());
        int n3 = Math.round(this.a.t * (float)this.a.getColorTextureWidth() / 360.0f);
        int n4 = Math.round(this.a.u * (float)this.a.getColorTextureHeight() / 100.0f);
        this.a.setCursorPosition(n3, n4);
        int n5 = Math.round(this.a.v * (float)this.a.getSliderTextureHeight() / 100.0f);
        this.a.setSliderPosition(n5);
        this.a.o = false;
    }
}

