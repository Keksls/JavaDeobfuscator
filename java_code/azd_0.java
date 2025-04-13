/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.wakfu.client.console.command.xulor.property.ListCommand;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from aZD
 */
public class azd_0
implements TObjectProcedure<fit_1> {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ ListCommand b;

    public azd_0(ListCommand listCommand, StringBuilder stringBuilder) {
        this.b = listCommand;
        this.a = stringBuilder;
    }

    public boolean a(fit_1 fit_12) {
        this.a.append('\n').append(" - ").append(fit_12.a());
        if (fit_12.f() instanceof ajf_1) {
            this.a.append(" (F)");
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fit_1)object);
    }
}

