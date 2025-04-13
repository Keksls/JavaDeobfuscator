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

public final class hP
extends GeneratedMessageV3.Builder<hP>
implements hQ {
    private int a;
    private List<hJ> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<hJ, hL, hM> c;

    public static final Descriptors.Descriptor a() {
        return hH.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hH.d.ensureFieldAccessorsInitialized(hN.class, hP.class);
    }

    hP() {
        this.m();
    }

    hP(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (hN.k()) {
            this.o();
        }
    }

    public hP e() {
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
        return hH.c;
    }

    public hN f() {
        return hN.h();
    }

    public hN g() {
        hN hN2 = this.h();
        if (!hN2.isInitialized()) {
            throw hP.newUninitializedMessageException((Message)hN2);
        }
        return hN2;
    }

    public hN h() {
        hN hN2 = new hN(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            hN2.d = this.b;
        } else {
            hN2.d = this.c.build();
        }
        this.onBuilt();
        return hN2;
    }

    public hP i() {
        return (hP)super.clone();
    }

    public hP a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hP)super.setField(fieldDescriptor, object);
    }

    public hP a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hP)super.clearField(fieldDescriptor);
    }

    public hP a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hP)super.clearOneof(oneofDescriptor);
    }

    public hP a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hP)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hP b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hP)super.addRepeatedField(fieldDescriptor, object);
    }

    public hP a(Message message) {
        if (message instanceof hN) {
            return this.a((hN)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hP a(hN hN2) {
        if (hN2 == hN.h()) {
            return this;
        }
        if (this.c == null) {
            if (!hN2.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = hN2.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(hN2.d);
                }
                this.onChanged();
            }
        } else if (!hN2.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = hN2.d;
                this.a &= 0xFFFFFFFE;
                this.c = hN.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(hN2.d);
            }
        }
        this.b(hN.b(hN2));
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

    public hP a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hN hN2 = null;
        try {
            hN2 = (hN)hN.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hN2 = (hN)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hN2 != null) {
                this.a(hN2);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<hJ>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<hJ> b() {
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
    public hJ a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (hJ)this.c.getMessage(n);
    }

    public hP a(int n, hJ hJ2) {
        if (this.c == null) {
            if (hJ2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, hJ2);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)hJ2);
        }
        return this;
    }

    public hP a(int n, hL hL2) {
        if (this.c == null) {
            this.n();
            this.b.set(n, hL2.f());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)hL2.f());
        }
        return this;
    }

    public hP a(hJ hJ2) {
        if (this.c == null) {
            if (hJ2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(hJ2);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)hJ2);
        }
        return this;
    }

    public hP b(int n, hJ hJ2) {
        if (this.c == null) {
            if (hJ2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, hJ2);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)hJ2);
        }
        return this;
    }

    public hP a(hL hL2) {
        if (this.c == null) {
            this.n();
            this.b.add(hL2.f());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)hL2.f());
        }
        return this;
    }

    public hP b(int n, hL hL2) {
        if (this.c == null) {
            this.n();
            this.b.add(n, hL2.f());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)hL2.f());
        }
        return this;
    }

    public hP a(Iterable<? extends hJ> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public hP j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public hP c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public hL d(int n) {
        return (hL)this.o().getBuilder(n);
    }

    @Override
    public hM b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (hM)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends hM> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public hL k() {
        return (hL)this.o().addBuilder((AbstractMessage)hJ.g());
    }

    public hL e(int n) {
        return (hL)this.o().addBuilder(n, (AbstractMessage)hJ.g());
    }

    public List<hL> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<hJ, hL, hM> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final hP a(UnknownFieldSet unknownFieldSet) {
        return (hP)super.setUnknownFields(unknownFieldSet);
    }

    public final hP b(UnknownFieldSet unknownFieldSet) {
        return (hP)super.mergeUnknownFields(unknownFieldSet);
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

