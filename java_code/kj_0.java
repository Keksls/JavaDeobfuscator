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
 * Renamed from kJ
 */
public final class kj_0
extends GeneratedMessageV3.Builder<kj_0>
implements kk_0 {
    private int a;
    private List<kE> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<kE, kg_0, kl_0> c;

    public static final Descriptors.Descriptor a() {
        return kC.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kC.d.ensureFieldAccessorsInitialized(kh_0.class, kj_0.class);
    }

    kj_0() {
        this.m();
    }

    kj_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (kh_0.k()) {
            this.o();
        }
    }

    public kj_0 e() {
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
        return kC.c;
    }

    public kh_0 f() {
        return kh_0.h();
    }

    public kh_0 g() {
        kh_0 kh_02 = this.h();
        if (!kh_02.isInitialized()) {
            throw kj_0.newUninitializedMessageException((Message)kh_02);
        }
        return kh_02;
    }

    public kh_0 h() {
        kh_0 kh_02 = new kh_0(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            kh_02.d = this.b;
        } else {
            kh_02.d = this.c.build();
        }
        this.onBuilt();
        return kh_02;
    }

    public kj_0 i() {
        return (kj_0)super.clone();
    }

    public kj_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kj_0)super.setField(fieldDescriptor, object);
    }

    public kj_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kj_0)super.clearField(fieldDescriptor);
    }

    public kj_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kj_0)super.clearOneof(oneofDescriptor);
    }

    public kj_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kj_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kj_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kj_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public kj_0 a(Message message) {
        if (message instanceof kh_0) {
            return this.a((kh_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kj_0 a(kh_0 kh_02) {
        if (kh_02 == kh_0.h()) {
            return this;
        }
        if (this.c == null) {
            if (!kh_02.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = kh_02.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(kh_02.d);
                }
                this.onChanged();
            }
        } else if (!kh_02.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = kh_02.d;
                this.a &= 0xFFFFFFFE;
                this.c = kh_0.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(kh_02.d);
            }
        }
        this.b(kh_0.b(kh_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public kj_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kh_0 kh_02 = null;
        try {
            kh_02 = (kh_0)kh_0.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kh_02 = (kh_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kh_02 != null) {
                this.a(kh_02);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<kE>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<kE> b() {
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
    public kE a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (kE)this.c.getMessage(n);
    }

    public kj_0 a(int n, kE kE2) {
        if (this.c == null) {
            if (kE2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, kE2);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)kE2);
        }
        return this;
    }

    public kj_0 a(int n, kg_0 kg_02) {
        if (this.c == null) {
            this.n();
            this.b.set(n, kg_02.k());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)kg_02.k());
        }
        return this;
    }

    public kj_0 a(kE kE2) {
        if (this.c == null) {
            if (kE2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(kE2);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)kE2);
        }
        return this;
    }

    public kj_0 b(int n, kE kE2) {
        if (this.c == null) {
            if (kE2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, kE2);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)kE2);
        }
        return this;
    }

    public kj_0 a(kg_0 kg_02) {
        if (this.c == null) {
            this.n();
            this.b.add(kg_02.k());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)kg_02.k());
        }
        return this;
    }

    public kj_0 b(int n, kg_0 kg_02) {
        if (this.c == null) {
            this.n();
            this.b.add(n, kg_02.k());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)kg_02.k());
        }
        return this;
    }

    public kj_0 a(Iterable<? extends kE> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public kj_0 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public kj_0 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public kg_0 d(int n) {
        return (kg_0)this.o().getBuilder(n);
    }

    @Override
    public kl_0 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (kl_0)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kl_0> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public kg_0 k() {
        return (kg_0)this.o().addBuilder((AbstractMessage)kE.l());
    }

    public kg_0 e(int n) {
        return (kg_0)this.o().addBuilder(n, (AbstractMessage)kE.l());
    }

    public List<kg_0> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kE, kg_0, kl_0> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final kj_0 a(UnknownFieldSet unknownFieldSet) {
        return (kj_0)super.setUnknownFields(unknownFieldSet);
    }

    public final kj_0 b(UnknownFieldSet unknownFieldSet) {
        return (kj_0)super.mergeUnknownFields(unknownFieldSet);
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

