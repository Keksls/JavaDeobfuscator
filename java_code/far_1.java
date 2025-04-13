/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from fAR
 */
public class far_1
extends faq_2
implements anr_1,
ans_1 {
    public static final String TAG = "dialogLoaded";
    private boolean a = false;

    @Override
    public String getTag() {
        return TAG;
    }

    private void a() {
        if (this.e == null) {
            this.a = false;
            return;
        }
        this.a = fpm_0.b().q(String.valueOf(this.e));
    }

    @Override
    public void a(boolean bl) {
        this.a();
        super.a(bl);
    }

    @Override
    public boolean isValid(Object object) {
        return this.a;
    }

    @Override
    public void a(String string) {
        if (!Objects.equals(string, this.e)) {
            return;
        }
        this.a(true);
    }

    @Override
    public void dialogUnloaded(String string) {
        if (!Objects.equals(string, this.e)) {
            return;
        }
        this.a(true);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a();
        fpm_0.b().a(this);
        fpm_0.b().a(this);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        fpm_0.b().b(this);
        fpm_0.b().b(this);
    }
}

