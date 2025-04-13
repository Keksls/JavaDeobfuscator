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

public final class lE
extends GeneratedMessageV3.Builder<lE>
implements lf_0 {
    private int a;
    private List<le_0> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<le_0, lg, lp> c;

    public static final Descriptors.Descriptor a() {
        return kM.s;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.t.ensureFieldAccessorsInitialized(lc_0.class, lE.class);
    }

    lE() {
        this.m();
    }

    lE(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (lc_0.k()) {
            this.o();
        }
    }

    public lE e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kM.s;
    }

    public lc_0 f() {
        return lc_0.h();
    }

    public lc_0 g() {
        lc_0 lc_02 = this.h();
        if (!lc_02.isInitialized()) {
            throw lE.newUninitializedMessageException((Message)lc_02);
        }
        return lc_02;
    }

    public lc_0 h() {
        lc_0 lc_02 = new lc_0(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            lc_02.d = this.b;
        } else {
            lc_02.d = this.c.build();
        }
        this.onBuilt();
        return lc_02;
    }

    public lE i() {
        return (lE)super.clone();
    }

    public lE a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lE)super.setField(fieldDescriptor, object);
    }

    public lE a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (lE)super.clearField(fieldDescriptor);
    }

    public lE a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (lE)super.clearOneof(oneofDescriptor);
    }

    public lE a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (lE)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public lE b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lE)super.addRepeatedField(fieldDescriptor, object);
    }

    public lE a(Message message) {
        if (message instanceof lc_0) {
            return this.a((lc_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public lE a(lc_0 lc_02) {
        if (lc_02 == lc_0.h()) {
            return this;
        }
        if (this.c == null) {
            if (!lc_02.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = lc_02.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(lc_02.d);
                }
                this.onChanged();
            }
        } else if (!lc_02.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = lc_02.d;
                this.a &= 0xFFFFFFFE;
                this.c = lc_0.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(lc_02.d);
            }
        }
        this.b(lc_0.b(lc_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public lE a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lc_0 lc_02 = null;
        try {
            lc_02 = (lc_0)lc_0.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lc_02 = (lc_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lc_02 != null) {
                this.a(lc_02);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<le_0>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<le_0> b() {
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
    public le_0 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (le_0)this.c.getMessage(n);
    }

    public lE a(int n, le_0 le_02) {
        if (this.c == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, le_02);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)le_02);
        }
        return this;
    }

    public lE a(int n, lg lg2) {
        if (this.c == null) {
            this.n();
            this.b.set(n, lg2.G());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)lg2.G());
        }
        return this;
    }

    public lE a(le_0 le_02) {
        if (this.c == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(le_02);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)le_02);
        }
        return this;
    }

    public lE b(int n, le_0 le_02) {
        if (this.c == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, le_02);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)le_02);
        }
        return this;
    }

    public lE a(lg lg2) {
        if (this.c == null) {
            this.n();
            this.b.add(lg2.G());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)lg2.G());
        }
        return this;
    }

    public lE b(int n, lg lg2) {
        if (this.c == null) {
            this.n();
            this.b.add(n, lg2.G());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)lg2.G());
        }
        return this;
    }

    public lE a(Iterable<? extends le_0> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public lE j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public lE c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public lg d(int n) {
        return (lg)this.o().getBuilder(n);
    }

    @Override
    public lp b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (lp)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends lp> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public lg k() {
        return (lg)this.o().addBuilder((AbstractMessage)le_0.H());
    }

    public lg e(int n) {
        return (lg)this.o().addBuilder(n, (AbstractMessage)le_0.H());
    }

    public List<lg> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<le_0, lg, lp> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final lE a(UnknownFieldSet unknownFieldSet) {
        return (lE)super.setUnknownFields(unknownFieldSet);
    }

    public final lE b(UnknownFieldSet unknownFieldSet) {
        return (lE)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

