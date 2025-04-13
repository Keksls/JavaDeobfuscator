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
 * Renamed from ms
 */
public final class ms_0
extends GeneratedMessageV3.Builder<ms_0>
implements mt_0 {
    private int a;
    private mu b = null;
    private SingleFieldBuilderV3<mu, mw, mx_0> c;
    private List<mm_0> d = Collections.emptyList();
    private RepeatedFieldBuilderV3<mm_0, mo_1, mp_0> e;
    private long f;

    public static final Descriptors.Descriptor a() {
        return mk.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mk.b.ensureFieldAccessorsInitialized(mq_0.class, ms_0.class);
    }

    ms_0() {
        this.u();
    }

    ms_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.u();
    }

    private void u() {
        if (mq_0.p()) {
            this.v();
            this.x();
        }
    }

    public ms_0 j() {
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
        return mk.a;
    }

    public mq_0 k() {
        return mq_0.m();
    }

    public mq_0 l() {
        mq_0 mq_02 = this.m();
        if (!mq_02.isInitialized()) {
            throw ms_0.newUninitializedMessageException((Message)mq_02);
        }
        return mq_02;
    }

    public mq_0 m() {
        mq_0 mq_02 = new mq_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        mq_02.g = this.c == null ? this.b : (mu)this.c.build();
        if (this.e == null) {
            if ((this.a & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.a &= 0xFFFFFFFD;
            }
            mq_02.h = this.d;
        } else {
            mq_02.h = this.e.build();
        }
        if ((n & 4) == 4) {
            n2 |= 2;
        }
        mq_02.i = this.f;
        mq_02.f = n2;
        this.onBuilt();
        return mq_02;
    }

    public ms_0 n() {
        return (ms_0)super.clone();
    }

    public ms_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ms_0)super.setField(fieldDescriptor, object);
    }

    public ms_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ms_0)super.clearField(fieldDescriptor);
    }

    public ms_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ms_0)super.clearOneof(oneofDescriptor);
    }

    public ms_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ms_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ms_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ms_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ms_0 a(Message message) {
        if (message instanceof mq_0) {
            return this.a((mq_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ms_0 a(mq_0 mq_02) {
        if (mq_02 == mq_0.m()) {
            return this;
        }
        if (mq_02.b()) {
            this.b(mq_02.c());
        }
        if (this.e == null) {
            if (!mq_02.h.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = mq_02.h;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.w();
                    this.d.addAll(mq_02.h);
                }
                this.onChanged();
            }
        } else if (!mq_02.h.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e.dispose();
                this.e = null;
                this.d = mq_02.h;
                this.a &= 0xFFFFFFFD;
                this.e = mq_0.q() ? this.x() : null;
            } else {
                this.e.addAllMessages(mq_02.h);
            }
        }
        if (mq_02.h()) {
            this.a(mq_02.i());
        }
        this.b(mq_0.b(mq_02));
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

    public ms_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mq_0 mq_02 = null;
        try {
            mq_02 = (mq_0)mq_0.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mq_02 = (mq_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mq_02 != null) {
                this.a(mq_02);
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

    public ms_0 a(mu mu2) {
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

    public ms_0 a(mw mw2) {
        if (this.c == null) {
            this.b = mw2.j();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)mw2.j());
        }
        this.a |= 1;
        return this;
    }

    public ms_0 b(mu mu2) {
        if (this.c == null) {
            this.b = (this.a & 1) == 1 && this.b != null && this.b != mu.k() ? mu.a(this.b).a(mu2).k() : mu2;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)mu2);
        }
        this.a |= 1;
        return this;
    }

    public ms_0 o() {
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
            this.d = new ArrayList<mm_0>(this.d);
            this.a |= 2;
        }
    }

    @Override
    public List<mm_0> e() {
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
    public mm_0 a(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (mm_0)this.e.getMessage(n);
    }

    public ms_0 a(int n, mm_0 mm_02) {
        if (this.e == null) {
            if (mm_02 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.d.set(n, mm_02);
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)mm_02);
        }
        return this;
    }

    public ms_0 a(int n, mo_1 mo_12) {
        if (this.e == null) {
            this.w();
            this.d.set(n, mo_12.v());
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)mo_12.v());
        }
        return this;
    }

    public ms_0 a(mm_0 mm_02) {
        if (this.e == null) {
            if (mm_02 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.d.add(mm_02);
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)mm_02);
        }
        return this;
    }

    public ms_0 b(int n, mm_0 mm_02) {
        if (this.e == null) {
            if (mm_02 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.d.add(n, mm_02);
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)mm_02);
        }
        return this;
    }

    public ms_0 a(mo_1 mo_12) {
        if (this.e == null) {
            this.w();
            this.d.add(mo_12.v());
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)mo_12.v());
        }
        return this;
    }

    public ms_0 b(int n, mo_1 mo_12) {
        if (this.e == null) {
            this.w();
            this.d.add(n, mo_12.v());
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)mo_12.v());
        }
        return this;
    }

    public ms_0 a(Iterable<? extends mm_0> iterable) {
        if (this.e == null) {
            this.w();
            AbstractMessageLite.Builder.addAll(iterable, this.d);
            this.onChanged();
        } else {
            this.e.addAllMessages(iterable);
        }
        return this;
    }

    public ms_0 q() {
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.e.clear();
        }
        return this;
    }

    public ms_0 c(int n) {
        if (this.e == null) {
            this.w();
            this.d.remove(n);
            this.onChanged();
        } else {
            this.e.remove(n);
        }
        return this;
    }

    public mo_1 d(int n) {
        return (mo_1)this.x().getBuilder(n);
    }

    @Override
    public mp_0 b(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (mp_0)this.e.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends mp_0> f() {
        if (this.e != null) {
            return this.e.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.d);
    }

    public mo_1 r() {
        return (mo_1)this.x().addBuilder((AbstractMessage)mm_0.w());
    }

    public mo_1 e(int n) {
        return (mo_1)this.x().addBuilder(n, (AbstractMessage)mm_0.w());
    }

    public List<mo_1> s() {
        return this.x().getBuilderList();
    }

    private RepeatedFieldBuilderV3<mm_0, mo_1, mp_0> x() {
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

    public ms_0 a(long l) {
        this.a |= 4;
        this.f = l;
        this.onChanged();
        return this;
    }

    public ms_0 t() {
        this.a &= 0xFFFFFFFB;
        this.f = 0L;
        this.onChanged();
        return this;
    }

    public final ms_0 a(UnknownFieldSet unknownFieldSet) {
        return (ms_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ms_0 b(UnknownFieldSet unknownFieldSet) {
        return (ms_0)super.mergeUnknownFields(unknownFieldSet);
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

