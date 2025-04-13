/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Renamed from cdQ
 */
abstract class cdq_2
implements ChangeListener {
    cdq_2() {
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        JSlider jSlider = (JSlider)changeEvent.getSource();
        this.a(cdf_2.a(jSlider));
    }

    protected abstract void a(float var1);
}

