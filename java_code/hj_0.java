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

/*
 * Renamed from hj
 */
public final class hj_0
extends GeneratedMessageV3.Builder<hj_0>
implements hk_0 {
    private int a;
    private List<hd_0> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<hd_0, hf, hg_0> c;

    public static final Descriptors.Descriptor a() {
        return hb.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hb.b.ensureFieldAccessorsInitialized(hh_0.class, hj_0.class);
    }

    hj_0() {
        this.m();
    }

    hj_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (hh_0.k()) {
            this.o();
        }
    }

    public hj_0 e() {
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
        return hb.a;
    }

    public hh_0 f() {
        return hh_0.h();
    }

    public hh_0 g() {
        hh_0 hh_02 = this.h();
        if (!hh_02.isInitialized()) {
            throw hj_0.newUninitializedMessageException((Message)hh_02);
        }
        return hh_02;
    }

    public hh_0 h() {
        hh_0 hh_02 = new hh_0(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            hh_02.d = this.b;
        } else {
            hh_02.d = this.c.build();
        }
        this.onBuilt();
        return hh_02;
    }

    public hj_0 i() {
        return (hj_0)super.clone();
    }

    public hj_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hj_0)super.setField(fieldDescriptor, object);
    }

    public hj_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hj_0)super.clearField(fieldDescriptor);
    }

    public hj_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hj_0)super.clearOneof(oneofDescriptor);
    }

    public hj_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hj_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hj_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hj_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public hj_0 a(Message message) {
        if (message instanceof hh_0) {
            return this.a((hh_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hj_0 a(hh_0 hh_02) {
        if (hh_02 == hh_0.h()) {
            return this;
        }
        if (this.c == null) {
            if (!hh_02.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = hh_02.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(hh_02.d);
                }
                this.onChanged();
            }
        } else if (!hh_02.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = hh_02.d;
                this.a &= 0xFFFFFFFE;
                this.c = hh_0.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(hh_02.d);
            }
        }
        this.b(hh_0.b(hh_02));
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

    public hj_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hh_0 hh_02 = null;
        try {
            hh_02 = (hh_0)hh_0.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hh_02 = (hh_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hh_02 != null) {
                this.a(hh_02);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<hd_0>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<hd_0> b() {
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
    public hd_0 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (hd_0)this.c.getMessage(n);
    }

    public hj_0 a(int n, hd_0 hd_02) {
        if (this.c == null) {
            if (hd_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, hd_02);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)hd_02);
        }
        return this;
    }

    public hj_0 a(int n, hf hf2) {
        if (this.c == null) {
            this.n();
            this.b.set(n, hf2.h());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)hf2.h());
        }
        return this;
    }

    public hj_0 a(hd_0 hd_02) {
        if (this.c == null) {
            if (hd_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(hd_02);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)hd_02);
        }
        return this;
    }

    public hj_0 b(int n, hd_0 hd_02) {
        if (this.c == null) {
            if (hd_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, hd_02);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)hd_02);
        }
        return this;
    }

    public hj_0 a(hf hf2) {
        if (this.c == null) {
            this.n();
            this.b.add(hf2.h());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)hf2.h());
        }
        return this;
    }

    public hj_0 b(int n, hf hf2) {
        if (this.c == null) {
            this.n();
            this.b.add(n, hf2.h());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)hf2.h());
        }
        return this;
    }

    public hj_0 a(Iterable<? extends hd_0> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public hj_0 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public hj_0 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public hf d(int n) {
        return (hf)this.o().getBuilder(n);
    }

    @Override
    public hg_0 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (hg_0)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends hg_0> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public hf k() {
        return (hf)this.o().addBuilder((AbstractMessage)hd_0.i());
    }

    public hf e(int n) {
        return (hf)this.o().addBuilder(n, (AbstractMessage)hd_0.i());
    }

    public List<hf> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<hd_0, hf, hg_0> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final hj_0 a(UnknownFieldSet unknownFieldSet) {
        return (hj_0)super.setUnknownFields(unknownFieldSet);
    }

    public final hj_0 b(UnknownFieldSet unknownFieldSet) {
        return (hj_0)super.mergeUnknownFields(unknownFieldSet);
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

