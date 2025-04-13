/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class lM
extends GeneratedMessageV3.Builder<lM>
implements lV {
    private int a;
    private List<lR> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<lR, lT, lU> c;
    private List<ln_0> d = Collections.emptyList();
    private RepeatedFieldBuilderV3<ln_0, lp_0, lQ> e;
    private int f;
    private int g;
    private int h = -1;

    public static final Descriptors.Descriptor a() {
        return kM.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.h.ensureFieldAccessorsInitialized(lk_0.class, lM.class);
    }

    lM() {
        this.B();
    }

    lM(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.B();
    }

    private void B() {
        if (lk_0.t()) {
            this.D();
            this.F();
        }
    }

    public lM n() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.e.clear();
        }
        this.f = 0;
        this.a &= 0xFFFFFFFB;
        this.g = 0;
        this.a &= 0xFFFFFFF7;
        this.h = -1;
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kM.g;
    }

    public lk_0 o() {
        return lk_0.q();
    }

    public lk_0 p() {
        lk_0 lk_02 = this.q();
        if (!lk_02.isInitialized()) {
            throw lM.newUninitializedMessageException((Message)lk_02);
        }
        return lk_02;
    }

    public lk_0 q() {
        lk_0 lk_02 = new lk_0(this);
        int n = this.a;
        int n2 = 0;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            lk_02.i = this.b;
        } else {
            lk_02.i = this.c.build();
        }
        if (this.e == null) {
            if ((this.a & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.a &= 0xFFFFFFFD;
            }
            lk_02.j = this.d;
        } else {
            lk_02.j = this.e.build();
        }
        if ((n & 4) == 4) {
            n2 |= 1;
        }
        lk_02.k = this.f;
        if ((n & 8) == 8) {
            n2 |= 2;
        }
        lk_02.l = this.g;
        if ((n & 0x10) == 16) {
            n2 |= 4;
        }
        lk_02.m = this.h;
        lk_02.h = n2;
        this.onBuilt();
        return lk_02;
    }

    public lM r() {
        return (lM)super.clone();
    }

    public lM a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lM)super.setField(fieldDescriptor, object);
    }

    public lM a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (lM)super.clearField(fieldDescriptor);
    }

    public lM a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (lM)super.clearOneof(oneofDescriptor);
    }

    public lM a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (lM)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public lM b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lM)super.addRepeatedField(fieldDescriptor, object);
    }

    public lM a(Message message) {
        if (message instanceof lk_0) {
            return this.a((lk_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public lM a(lk_0 lk_02) {
        if (lk_02 == lk_0.q()) {
            return this;
        }
        if (this.c == null) {
            if (!lk_02.i.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = lk_02.i;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.C();
                    this.b.addAll(lk_02.i);
                }
                this.onChanged();
            }
        } else if (!lk_02.i.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = lk_02.i;
                this.a &= 0xFFFFFFFE;
                this.c = lk_0.u() ? this.D() : null;
            } else {
                this.c.addAllMessages(lk_02.i);
            }
        }
        if (this.e == null) {
            if (!lk_02.j.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = lk_02.j;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.E();
                    this.d.addAll(lk_02.j);
                }
                this.onChanged();
            }
        } else if (!lk_02.j.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e.dispose();
                this.e = null;
                this.d = lk_02.j;
                this.a &= 0xFFFFFFFD;
                this.e = lk_0.v() ? this.F() : null;
            } else {
                this.e.addAllMessages(lk_02.j);
            }
        }
        if (lk_02.h()) {
            this.k(lk_02.i());
        }
        if (lk_02.j()) {
            this.l(lk_02.k());
        }
        if (lk_02.l()) {
            this.m(lk_02.m());
        }
        this.b(lk_0.b(lk_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        for (n = 0; n < this.d(); ++n) {
            if (this.a(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.g(); ++n) {
            if (this.c(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public lM a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lk_0 lk_02 = null;
        try {
            lk_02 = (lk_0)lk_0.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lk_02 = (lk_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lk_02 != null) {
                this.a(lk_02);
            }
        }
        return this;
    }

    private void C() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<lR>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<lR> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public lR a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (lR)this.c.getMessage(n);
    }

    public lM a(int n, lR lR2) {
        if (this.c == null) {
            if (lR2 == null) {
                throw new NullPointerException();
            }
            this.C();
            this.b.set(n, lR2);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)lR2);
        }
        return this;
    }

    public lM a(int n, lT lT2) {
        if (this.c == null) {
            this.C();
            this.b.set(n, lT2.l());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)lT2.l());
        }
        return this;
    }

    public lM a(lR lR2) {
        if (this.c == null) {
            if (lR2 == null) {
                throw new NullPointerException();
            }
            this.C();
            this.b.add(lR2);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)lR2);
        }
        return this;
    }

    public lM b(int n, lR lR2) {
        if (this.c == null) {
            if (lR2 == null) {
                throw new NullPointerException();
            }
            this.C();
            this.b.add(n, lR2);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)lR2);
        }
        return this;
    }

    public lM a(lT lT2) {
        if (this.c == null) {
            this.C();
            this.b.add(lT2.l());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)lT2.l());
        }
        return this;
    }

    public lM b(int n, lT lT2) {
        if (this.c == null) {
            this.C();
            this.b.add(n, lT2.l());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)lT2.l());
        }
        return this;
    }

    public lM a(Iterable<? extends lR> iterable) {
        if (this.c == null) {
            this.C();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public lM s() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public lM e(int n) {
        if (this.c == null) {
            this.C();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public lT f(int n) {
        return (lT)this.D().getBuilder(n);
    }

    @Override
    public lU b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (lU)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends lU> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public lT t() {
        return (lT)this.D().addBuilder((AbstractMessage)lR.m());
    }

    public lT g(int n) {
        return (lT)this.D().addBuilder(n, (AbstractMessage)lR.m());
    }

    public List<lT> u() {
        return this.D().getBuilderList();
    }

    private RepeatedFieldBuilderV3<lR, lT, lU> D() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    private void E() {
        if ((this.a & 2) != 2) {
            this.d = new ArrayList<ln_0>(this.d);
            this.a |= 2;
        }
    }

    @Override
    public List<ln_0> e() {
        if (this.e == null) {
            return Collections.unmodifiableList(this.d);
        }
        return this.e.getMessageList();
    }

    @Override
    public int g() {
        if (this.e == null) {
            return this.d.size();
        }
        return this.e.getCount();
    }

    @Override
    public ln_0 c(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (ln_0)this.e.getMessage(n);
    }

    public lM a(int n, ln_0 ln_02) {
        if (this.e == null) {
            if (ln_02 == null) {
                throw new NullPointerException();
            }
            this.E();
            this.d.set(n, ln_02);
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)ln_02);
        }
        return this;
    }

    public lM a(int n, lp_0 lp_02) {
        if (this.e == null) {
            this.E();
            this.d.set(n, lp_02.h());
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)lp_02.h());
        }
        return this;
    }

    public lM a(ln_0 ln_02) {
        if (this.e == null) {
            if (ln_02 == null) {
                throw new NullPointerException();
            }
            this.E();
            this.d.add(ln_02);
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)ln_02);
        }
        return this;
    }

    public lM b(int n, ln_0 ln_02) {
        if (this.e == null) {
            if (ln_02 == null) {
                throw new NullPointerException();
            }
            this.E();
            this.d.add(n, ln_02);
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)ln_02);
        }
        return this;
    }

    public lM a(lp_0 lp_02) {
        if (this.e == null) {
            this.E();
            this.d.add(lp_02.h());
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)lp_02.h());
        }
        return this;
    }

    public lM b(int n, lp_0 lp_02) {
        if (this.e == null) {
            this.E();
            this.d.add(n, lp_02.h());
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)lp_02.h());
        }
        return this;
    }

    public lM b(Iterable<? extends ln_0> iterable) {
        if (this.e == null) {
            this.E();
            AbstractMessageLite.Builder.addAll(iterable, this.d);
            this.onChanged();
        } else {
            this.e.addAllMessages(iterable);
        }
        return this;
    }

    public lM v() {
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.e.clear();
        }
        return this;
    }

    public lM h(int n) {
        if (this.e == null) {
            this.E();
            this.d.remove(n);
            this.onChanged();
        } else {
            this.e.remove(n);
        }
        return this;
    }

    public lp_0 i(int n) {
        return (lp_0)this.F().getBuilder(n);
    }

    @Override
    public lQ d(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (lQ)this.e.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends lQ> f() {
        if (this.e != null) {
            return this.e.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.d);
    }

    public lp_0 w() {
        return (lp_0)this.F().addBuilder((AbstractMessage)ln_0.i());
    }

    public lp_0 j(int n) {
        return (lp_0)this.F().addBuilder(n, (AbstractMessage)ln_0.i());
    }

    public List<lp_0> x() {
        return this.F().getBuilderList();
    }

    private RepeatedFieldBuilderV3<ln_0, lp_0, lQ> F() {
        if (this.e == null) {
            this.e = new RepeatedFieldBuilderV3(this.d, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.d = null;
        }
        return this.e;
    }

    @Override
    public boolean h() {
        return (this.a & 4) == 4;
    }

    @Override
    public int i() {
        return this.f;
    }

    public lM k(int n) {
        this.a |= 4;
        this.f = n;
        this.onChanged();
        return this;
    }

    public lM y() {
        this.a &= 0xFFFFFFFB;
        this.f = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean j() {
        return (this.a & 8) == 8;
    }

    @Override
    public int k() {
        return this.g;
    }

    public lM l(int n) {
        this.a |= 8;
        this.g = n;
        this.onChanged();
        return this;
    }

    public lM z() {
        this.a &= 0xFFFFFFF7;
        this.g = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean l() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public int m() {
        return this.h;
    }

    public lM m(int n) {
        this.a |= 0x10;
        this.h = n;
        this.onChanged();
        return this;
    }

    public lM A() {
        this.a &= 0xFFFFFFEF;
        this.h = -1;
        this.onChanged();
        return this;
    }

    public final lM a(UnknownFieldSet unknownFieldSet) {
        return (lM)super.setUnknownFields(unknownFieldSet);
    }

    public final lM b(UnknownFieldSet unknownFieldSet) {
        return (lM)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.n();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.r();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.n();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.r();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.r();
    }

    public /* synthetic */ Message buildPartial() {
        return this.q();
    }

    public /* synthetic */ Message build() {
        return this.p();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.r();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.q();
    }

    public /* synthetic */ MessageLite build() {
        return this.p();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.n();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.r();
    }

    public /* synthetic */ Object clone() {
        return this.r();
    }
}

