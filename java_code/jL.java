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

public final class jL
extends GeneratedMessageV3.Builder<jL>
implements jM {
    private int a;
    private List<jG> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<jG, jI, jN> c;

    public static final Descriptors.Descriptor a() {
        return jE.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jE.d.ensureFieldAccessorsInitialized(jJ.class, jL.class);
    }

    jL() {
        this.m();
    }

    jL(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (jJ.k()) {
            this.o();
        }
    }

    public jL e() {
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
        return jE.c;
    }

    public jJ f() {
        return jJ.h();
    }

    public jJ g() {
        jJ jJ2 = this.h();
        if (!jJ2.isInitialized()) {
            throw jL.newUninitializedMessageException((Message)jJ2);
        }
        return jJ2;
    }

    public jJ h() {
        jJ jJ2 = new jJ(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            jJ2.d = this.b;
        } else {
            jJ2.d = this.c.build();
        }
        this.onBuilt();
        return jJ2;
    }

    public jL i() {
        return (jL)super.clone();
    }

    public jL a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jL)super.setField(fieldDescriptor, object);
    }

    public jL a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jL)super.clearField(fieldDescriptor);
    }

    public jL a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jL)super.clearOneof(oneofDescriptor);
    }

    public jL a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jL)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jL b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jL)super.addRepeatedField(fieldDescriptor, object);
    }

    public jL a(Message message) {
        if (message instanceof jJ) {
            return this.a((jJ)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jL a(jJ jJ2) {
        if (jJ2 == jJ.h()) {
            return this;
        }
        if (this.c == null) {
            if (!jJ2.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = jJ2.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(jJ2.d);
                }
                this.onChanged();
            }
        } else if (!jJ2.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = jJ2.d;
                this.a &= 0xFFFFFFFE;
                this.c = jJ.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(jJ2.d);
            }
        }
        this.b(jJ.b(jJ2));
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

    public jL a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jJ jJ2 = null;
        try {
            jJ2 = (jJ)jJ.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jJ2 = (jJ)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jJ2 != null) {
                this.a(jJ2);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<jG>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<jG> b() {
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
    public jG a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (jG)this.c.getMessage(n);
    }

    public jL a(int n, jG jG2) {
        if (this.c == null) {
            if (jG2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, jG2);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)jG2);
        }
        return this;
    }

    public jL a(int n, jI jI2) {
        if (this.c == null) {
            this.n();
            this.b.set(n, jI2.f());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)jI2.f());
        }
        return this;
    }

    public jL a(jG jG2) {
        if (this.c == null) {
            if (jG2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(jG2);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)jG2);
        }
        return this;
    }

    public jL b(int n, jG jG2) {
        if (this.c == null) {
            if (jG2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, jG2);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)jG2);
        }
        return this;
    }

    public jL a(jI jI2) {
        if (this.c == null) {
            this.n();
            this.b.add(jI2.f());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)jI2.f());
        }
        return this;
    }

    public jL b(int n, jI jI2) {
        if (this.c == null) {
            this.n();
            this.b.add(n, jI2.f());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)jI2.f());
        }
        return this;
    }

    public jL a(Iterable<? extends jG> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public jL j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public jL c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public jI d(int n) {
        return (jI)this.o().getBuilder(n);
    }

    @Override
    public jN b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (jN)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jN> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public jI k() {
        return (jI)this.o().addBuilder((AbstractMessage)jG.g());
    }

    public jI e(int n) {
        return (jI)this.o().addBuilder(n, (AbstractMessage)jG.g());
    }

    public List<jI> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<jG, jI, jN> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final jL a(UnknownFieldSet unknownFieldSet) {
        return (jL)super.setUnknownFields(unknownFieldSet);
    }

    public final jL b(UnknownFieldSet unknownFieldSet) {
        return (jL)super.mergeUnknownFields(unknownFieldSet);
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

