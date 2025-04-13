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

public final class kY
extends GeneratedMessageV3.Builder<kY>
implements kZ {
    private int a;
    private List<kO> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<kO, kQ, kV> c;

    public static final Descriptors.Descriptor a() {
        return kM.y;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.z.ensureFieldAccessorsInitialized(kW.class, kY.class);
    }

    kY() {
        this.m();
    }

    kY(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (kW.k()) {
            this.o();
        }
    }

    public kY e() {
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
        return kM.y;
    }

    public kW f() {
        return kW.h();
    }

    public kW g() {
        kW kW2 = this.h();
        if (!kW2.isInitialized()) {
            throw kY.newUninitializedMessageException((Message)kW2);
        }
        return kW2;
    }

    public kW h() {
        kW kW2 = new kW(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            kW2.d = this.b;
        } else {
            kW2.d = this.c.build();
        }
        this.onBuilt();
        return kW2;
    }

    public kY i() {
        return (kY)super.clone();
    }

    public kY a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kY)super.setField(fieldDescriptor, object);
    }

    public kY a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kY)super.clearField(fieldDescriptor);
    }

    public kY a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kY)super.clearOneof(oneofDescriptor);
    }

    public kY a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kY)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kY b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kY)super.addRepeatedField(fieldDescriptor, object);
    }

    public kY a(Message message) {
        if (message instanceof kW) {
            return this.a((kW)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kY a(kW kW2) {
        if (kW2 == kW.h()) {
            return this;
        }
        if (this.c == null) {
            if (!kW2.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = kW2.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(kW2.d);
                }
                this.onChanged();
            }
        } else if (!kW2.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = kW2.d;
                this.a &= 0xFFFFFFFE;
                this.c = kW.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(kW2.d);
            }
        }
        this.b(kW.b(kW2));
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

    public kY a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kW kW2 = null;
        try {
            kW2 = (kW)kW.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kW2 = (kW)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kW2 != null) {
                this.a(kW2);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<kO>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<kO> b() {
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
    public kO a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (kO)this.c.getMessage(n);
    }

    public kY a(int n, kO kO2) {
        if (this.c == null) {
            if (kO2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, kO2);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)kO2);
        }
        return this;
    }

    public kY a(int n, kQ kQ2) {
        if (this.c == null) {
            this.n();
            this.b.set(n, kQ2.o());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)kQ2.o());
        }
        return this;
    }

    public kY a(kO kO2) {
        if (this.c == null) {
            if (kO2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(kO2);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)kO2);
        }
        return this;
    }

    public kY b(int n, kO kO2) {
        if (this.c == null) {
            if (kO2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, kO2);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)kO2);
        }
        return this;
    }

    public kY a(kQ kQ2) {
        if (this.c == null) {
            this.n();
            this.b.add(kQ2.o());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)kQ2.o());
        }
        return this;
    }

    public kY b(int n, kQ kQ2) {
        if (this.c == null) {
            this.n();
            this.b.add(n, kQ2.o());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)kQ2.o());
        }
        return this;
    }

    public kY a(Iterable<? extends kO> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public kY j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public kY c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public kQ d(int n) {
        return (kQ)this.o().getBuilder(n);
    }

    @Override
    public kV b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (kV)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kV> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public kQ k() {
        return (kQ)this.o().addBuilder((AbstractMessage)kO.p());
    }

    public kQ e(int n) {
        return (kQ)this.o().addBuilder(n, (AbstractMessage)kO.p());
    }

    public List<kQ> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kO, kQ, kV> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final kY a(UnknownFieldSet unknownFieldSet) {
        return (kY)super.setUnknownFields(unknownFieldSet);
    }

    public final kY b(UnknownFieldSet unknownFieldSet) {
        return (kY)super.mergeUnknownFields(unknownFieldSet);
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

