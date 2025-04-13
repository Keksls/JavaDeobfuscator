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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class mM
extends GeneratedMessageV3.Builder<mM>
implements mn_1 {
    private int a;
    private mu b = null;
    private SingleFieldBuilderV3<mu, mw, mx_0> c;
    private List<mE> d = Collections.emptyList();
    private RepeatedFieldBuilderV3<mE, mG, mH> e;
    private long f;

    public static final Descriptors.Descriptor a() {
        return mC.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mC.b.ensureFieldAccessorsInitialized(mk_0.class, mM.class);
    }

    mM() {
        this.u();
    }

    mM(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.u();
    }

    private void u() {
        if (mk_0.p()) {
            this.v();
            this.x();
        }
    }

    public mM j() {
        super.clear();
        if (this.c == null) {
            this.b = null;
        } else {
            this.c.clear();
        }
        this.a &= 0xFFFFFFFE;
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.e.clear();
        }
        this.f = 0L;
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mC.a;
    }

    public mk_0 k() {
        return mk_0.m();
    }

    public mk_0 l() {
        mk_0 mk_02 = this.m();
        if (!mk_02.isInitialized()) {
            throw mM.newUninitializedMessageException((Message)mk_02);
        }
        return mk_02;
    }

    public mk_0 m() {
        mk_0 mk_02 = new mk_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        mk_02.g = this.c == null ? this.b : (mu)this.c.build();
        if (this.e == null) {
            if ((this.a & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.a &= 0xFFFFFFFD;
            }
            mk_02.h = this.d;
        } else {
            mk_02.h = this.e.build();
        }
        if ((n & 4) == 4) {
            n2 |= 2;
        }
        mk_02.i = this.f;
        mk_02.f = n2;
        this.onBuilt();
        return mk_02;
    }

    public mM n() {
        return (mM)super.clone();
    }

    public mM a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mM)super.setField(fieldDescriptor, object);
    }

    public mM a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mM)super.clearField(fieldDescriptor);
    }

    public mM a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mM)super.clearOneof(oneofDescriptor);
    }

    public mM a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mM)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mM b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mM)super.addRepeatedField(fieldDescriptor, object);
    }

    public mM a(Message message) {
        if (message instanceof mk_0) {
            return this.a((mk_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mM a(mk_0 mk_02) {
        if (mk_02 == mk_0.m()) {
            return this;
        }
        if (mk_02.b()) {
            this.b(mk_02.c());
        }
        if (this.e == null) {
            if (!mk_02.h.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = mk_02.h;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.w();
                    this.d.addAll(mk_02.h);
                }
                this.onChanged();
            }
        } else if (!mk_02.h.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e.dispose();
                this.e = null;
                this.d = mk_02.h;
                this.a &= 0xFFFFFFFD;
                this.e = mk_0.q() ? this.x() : null;
            } else {
                this.e.addAllMessages(mk_02.h);
            }
        }
        if (mk_02.h()) {
            this.a(mk_02.i());
        }
        this.b(mk_0.b(mk_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.h()) {
            return false;
        }
        if (!this.c().isInitialized()) {
            return false;
        }
        for (int k = 0; k < this.g(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public mM a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mk_0 mk_02 = null;
        try {
            mk_02 = (mk_0)mk_0.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mk_02 = (mk_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mk_02 != null) {
                this.a(mk_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public mu c() {
        if (this.c == null) {
            return this.b == null ? mu.k() : this.b;
        }
        return (mu)this.c.getMessage();
    }

    public mM a(mu mu2) {
        if (this.c == null) {
            if (mu2 == null) {
                throw new NullPointerException();
            }
            this.b = mu2;
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)mu2);
        }
        this.a |= 1;
        return this;
    }

    public mM a(mw mw2) {
        if (this.c == null) {
            this.b = mw2.j();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)mw2.j());
        }
        this.a |= 1;
        return this;
    }

    public mM b(mu mu2) {
        if (this.c == null) {
            this.b = (this.a & 1) == 1 && this.b != null && this.b != mu.k() ? mu.a(this.b).a(mu2).k() : mu2;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)mu2);
        }
        this.a |= 1;
        return this;
    }

    public mM o() {
        if (this.c == null) {
            this.b = null;
            this.onChanged();
        } else {
            this.c.clear();
        }
        this.a &= 0xFFFFFFFE;
        return this;
    }

    public mw p() {
        this.a |= 1;
        this.onChanged();
        return (mw)this.v().getBuilder();
    }

    @Override
    public mx_0 d() {
        if (this.c != null) {
            return (mx_0)this.c.getMessageOrBuilder();
        }
        return this.b == null ? mu.k() : this.b;
    }

    private SingleFieldBuilderV3<mu, mw, mx_0> v() {
        if (this.c == null) {
            this.c = new SingleFieldBuilderV3((AbstractMessage)this.c(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    private void w() {
        if ((this.a & 2) != 2) {
            this.d = new ArrayList<mE>(this.d);
            this.a |= 2;
        }
    }

    @Override
    public List<mE> e() {
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
    public mE a(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (mE)this.e.getMessage(n);
    }

    public mM a(int n, mE mE2) {
        if (this.e == null) {
            if (mE2 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.d.set(n, mE2);
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)mE2);
        }
        return this;
    }

    public mM a(int n, mG mG2) {
        if (this.e == null) {
            this.w();
            this.d.set(n, mG2.s());
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)mG2.s());
        }
        return this;
    }

    public mM a(mE mE2) {
        if (this.e == null) {
            if (mE2 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.d.add(mE2);
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)mE2);
        }
        return this;
    }

    public mM b(int n, mE mE2) {
        if (this.e == null) {
            if (mE2 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.d.add(n, mE2);
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)mE2);
        }
        return this;
    }

    public mM a(mG mG2) {
        if (this.e == null) {
            this.w();
            this.d.add(mG2.s());
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)mG2.s());
        }
        return this;
    }

    public mM b(int n, mG mG2) {
        if (this.e == null) {
            this.w();
            this.d.add(n, mG2.s());
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)mG2.s());
        }
        return this;
    }

    public mM a(Iterable<? extends mE> iterable) {
        if (this.e == null) {
            this.w();
            AbstractMessageLite.Builder.addAll(iterable, this.d);
            this.onChanged();
        } else {
            this.e.addAllMessages(iterable);
        }
        return this;
    }

    public mM q() {
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.e.clear();
        }
        return this;
    }

    public mM c(int n) {
        if (this.e == null) {
            this.w();
            this.d.remove(n);
            this.onChanged();
        } else {
            this.e.remove(n);
        }
        return this;
    }

    public mG d(int n) {
        return (mG)this.x().getBuilder(n);
    }

    @Override
    public mH b(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (mH)this.e.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends mH> f() {
        if (this.e != null) {
            return this.e.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.d);
    }

    public mG r() {
        return (mG)this.x().addBuilder((AbstractMessage)mE.t());
    }

    public mG e(int n) {
        return (mG)this.x().addBuilder(n, (AbstractMessage)mE.t());
    }

    public List<mG> s() {
        return this.x().getBuilderList();
    }

    private RepeatedFieldBuilderV3<mE, mG, mH> x() {
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
    public long i() {
        return this.f;
    }

    public mM a(long l) {
        this.a |= 4;
        this.f = l;
        this.onChanged();
        return this;
    }

    public mM t() {
        this.a &= 0xFFFFFFFB;
        this.f = 0L;
        this.onChanged();
        return this;
    }

    public final mM a(UnknownFieldSet unknownFieldSet) {
        return (mM)super.setUnknownFields(unknownFieldSet);
    }

    public final mM b(UnknownFieldSet unknownFieldSet) {
        return (mM)super.mergeUnknownFields(unknownFieldSet);
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
        return this.j();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.n();
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
        return this.j();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.n();
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
        return this.n();
    }

    public /* synthetic */ Message buildPartial() {
        return this.m();
    }

    public /* synthetic */ Message build() {
        return this.l();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.m();
    }

    public /* synthetic */ MessageLite build() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ Object clone() {
        return this.n();
    }
}

