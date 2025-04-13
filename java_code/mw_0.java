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

/*
 * Renamed from mW
 */
public final class mw_0
extends GeneratedMessageV3.Builder<mw_0>
implements mX {
    private int a;
    private mu b = null;
    private SingleFieldBuilderV3<mu, mw, mx_0> c;
    private List<mq_1> d = Collections.emptyList();
    private RepeatedFieldBuilderV3<mq_1, mS, mT> e;
    private long f;

    public static final Descriptors.Descriptor a() {
        return mo_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mo_0.b.ensureFieldAccessorsInitialized(mu_0.class, mw_0.class);
    }

    mw_0() {
        this.u();
    }

    mw_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.u();
    }

    private void u() {
        if (mu_0.p()) {
            this.v();
            this.x();
        }
    }

    public mw_0 j() {
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
        return mo_0.a;
    }

    public mu_0 k() {
        return mu_0.m();
    }

    public mu_0 l() {
        mu_0 mu_02 = this.m();
        if (!mu_02.isInitialized()) {
            throw mw_0.newUninitializedMessageException((Message)mu_02);
        }
        return mu_02;
    }

    public mu_0 m() {
        mu_0 mu_02 = new mu_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        mu_02.g = this.c == null ? this.b : (mu)this.c.build();
        if (this.e == null) {
            if ((this.a & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.a &= 0xFFFFFFFD;
            }
            mu_02.h = this.d;
        } else {
            mu_02.h = this.e.build();
        }
        if ((n & 4) == 4) {
            n2 |= 2;
        }
        mu_02.i = this.f;
        mu_02.f = n2;
        this.onBuilt();
        return mu_02;
    }

    public mw_0 n() {
        return (mw_0)super.clone();
    }

    public mw_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mw_0)super.setField(fieldDescriptor, object);
    }

    public mw_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mw_0)super.clearField(fieldDescriptor);
    }

    public mw_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mw_0)super.clearOneof(oneofDescriptor);
    }

    public mw_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mw_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mw_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mw_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public mw_0 a(Message message) {
        if (message instanceof mu_0) {
            return this.a((mu_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mw_0 a(mu_0 mu_02) {
        if (mu_02 == mu_0.m()) {
            return this;
        }
        if (mu_02.b()) {
            this.b(mu_02.c());
        }
        if (this.e == null) {
            if (!mu_02.h.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = mu_02.h;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.w();
                    this.d.addAll(mu_02.h);
                }
                this.onChanged();
            }
        } else if (!mu_02.h.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e.dispose();
                this.e = null;
                this.d = mu_02.h;
                this.a &= 0xFFFFFFFD;
                this.e = mu_0.q() ? this.x() : null;
            } else {
                this.e.addAllMessages(mu_02.h);
            }
        }
        if (mu_02.h()) {
            this.a(mu_02.i());
        }
        this.b(mu_0.b(mu_02));
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

    public mw_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mu_0 mu_02 = null;
        try {
            mu_02 = (mu_0)mu_0.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mu_02 = (mu_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mu_02 != null) {
                this.a(mu_02);
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

    public mw_0 a(mu mu2) {
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

    public mw_0 a(mw mw2) {
        if (this.c == null) {
            this.b = mw2.j();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)mw2.j());
        }
        this.a |= 1;
        return this;
    }

    public mw_0 b(mu mu2) {
        if (this.c == null) {
            this.b = (this.a & 1) == 1 && this.b != null && this.b != mu.k() ? mu.a(this.b).a(mu2).k() : mu2;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)mu2);
        }
        this.a |= 1;
        return this;
    }

    public mw_0 o() {
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
            this.d = new ArrayList<mq_1>(this.d);
            this.a |= 2;
        }
    }

    @Override
    public List<mq_1> e() {
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
    public mq_1 a(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (mq_1)this.e.getMessage(n);
    }

    public mw_0 a(int n, mq_1 mq_12) {
        if (this.e == null) {
            if (mq_12 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.d.set(n, mq_12);
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)mq_12);
        }
        return this;
    }

    public mw_0 a(int n, mS mS2) {
        if (this.e == null) {
            this.w();
            this.d.set(n, mS2.I());
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)mS2.I());
        }
        return this;
    }

    public mw_0 a(mq_1 mq_12) {
        if (this.e == null) {
            if (mq_12 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.d.add(mq_12);
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)mq_12);
        }
        return this;
    }

    public mw_0 b(int n, mq_1 mq_12) {
        if (this.e == null) {
            if (mq_12 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.d.add(n, mq_12);
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)mq_12);
        }
        return this;
    }

    public mw_0 a(mS mS2) {
        if (this.e == null) {
            this.w();
            this.d.add(mS2.I());
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)mS2.I());
        }
        return this;
    }

    public mw_0 b(int n, mS mS2) {
        if (this.e == null) {
            this.w();
            this.d.add(n, mS2.I());
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)mS2.I());
        }
        return this;
    }

    public mw_0 a(Iterable<? extends mq_1> iterable) {
        if (this.e == null) {
            this.w();
            AbstractMessageLite.Builder.addAll(iterable, this.d);
            this.onChanged();
        } else {
            this.e.addAllMessages(iterable);
        }
        return this;
    }

    public mw_0 q() {
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.e.clear();
        }
        return this;
    }

    public mw_0 c(int n) {
        if (this.e == null) {
            this.w();
            this.d.remove(n);
            this.onChanged();
        } else {
            this.e.remove(n);
        }
        return this;
    }

    public mS d(int n) {
        return (mS)this.x().getBuilder(n);
    }

    @Override
    public mT b(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (mT)this.e.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends mT> f() {
        if (this.e != null) {
            return this.e.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.d);
    }

    public mS r() {
        return (mS)this.x().addBuilder((AbstractMessage)mq_1.J());
    }

    public mS e(int n) {
        return (mS)this.x().addBuilder(n, (AbstractMessage)mq_1.J());
    }

    public List<mS> s() {
        return this.x().getBuilderList();
    }

    private RepeatedFieldBuilderV3<mq_1, mS, mT> x() {
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

    public mw_0 a(long l) {
        this.a |= 4;
        this.f = l;
        this.onChanged();
        return this;
    }

    public mw_0 t() {
        this.a &= 0xFFFFFFFB;
        this.f = 0L;
        this.onChanged();
        return this;
    }

    public final mw_0 a(UnknownFieldSet unknownFieldSet) {
        return (mw_0)super.setUnknownFields(unknownFieldSet);
    }

    public final mw_0 b(UnknownFieldSet unknownFieldSet) {
        return (mw_0)super.mergeUnknownFields(unknownFieldSet);
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

