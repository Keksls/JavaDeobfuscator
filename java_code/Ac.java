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

public final class Ac
extends GeneratedMessageV3.Builder<Ac>
implements Ad {
    private int a;
    private int b;
    private List<Ai> c = Collections.emptyList();
    private RepeatedFieldBuilderV3<Ai, Ak, Al> d;
    private List<Ai> e = Collections.emptyList();
    private RepeatedFieldBuilderV3<Ai, Ak, Al> f;
    private int g;

    public static final Descriptors.Descriptor a() {
        return zy_1.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zy_1.d.ensureFieldAccessorsInitialized(Aa.class, Ac.class);
    }

    Ac() {
        this.y();
    }

    Ac(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.y();
    }

    private void y() {
        if (Aa.r()) {
            this.A();
            this.C();
        }
    }

    public Ac l() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.d.clear();
        }
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
        } else {
            this.f.clear();
        }
        this.g = 0;
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zy_1.c;
    }

    public Aa m() {
        return Aa.o();
    }

    public Aa n() {
        Aa aa = this.o();
        if (!aa.isInitialized()) {
            throw Ac.newUninitializedMessageException((Message)aa);
        }
        return aa;
    }

    public Aa o() {
        Aa aa = new Aa(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        aa.h = this.b;
        if (this.d == null) {
            if ((this.a & 2) == 2) {
                this.c = Collections.unmodifiableList(this.c);
                this.a &= 0xFFFFFFFD;
            }
            aa.i = this.c;
        } else {
            aa.i = this.d.build();
        }
        if (this.f == null) {
            if ((this.a & 4) == 4) {
                this.e = Collections.unmodifiableList(this.e);
                this.a &= 0xFFFFFFFB;
            }
            aa.j = this.e;
        } else {
            aa.j = this.f.build();
        }
        if ((n & 8) == 8) {
            n2 |= 2;
        }
        aa.k = this.g;
        aa.g = n2;
        this.onBuilt();
        return aa;
    }

    public Ac p() {
        return (Ac)super.clone();
    }

    public Ac a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Ac)super.setField(fieldDescriptor, object);
    }

    public Ac a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (Ac)super.clearField(fieldDescriptor);
    }

    public Ac a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (Ac)super.clearOneof(oneofDescriptor);
    }

    public Ac a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (Ac)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public Ac b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Ac)super.addRepeatedField(fieldDescriptor, object);
    }

    public Ac a(Message message) {
        if (message instanceof Aa) {
            return this.a((Aa)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public Ac a(Aa aa) {
        if (aa == Aa.o()) {
            return this;
        }
        if (aa.b()) {
            this.e(aa.c());
        }
        if (this.d == null) {
            if (!aa.i.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = aa.i;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.z();
                    this.c.addAll(aa.i);
                }
                this.onChanged();
            }
        } else if (!aa.i.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d.dispose();
                this.d = null;
                this.c = aa.i;
                this.a &= 0xFFFFFFFD;
                this.d = Aa.s() ? this.A() : null;
            } else {
                this.d.addAllMessages(aa.i);
            }
        }
        if (this.f == null) {
            if (!aa.j.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = aa.j;
                    this.a &= 0xFFFFFFFB;
                } else {
                    this.B();
                    this.e.addAll(aa.j);
                }
                this.onChanged();
            }
        } else if (!aa.j.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f.dispose();
                this.f = null;
                this.e = aa.j;
                this.a &= 0xFFFFFFFB;
                this.f = Aa.t() ? this.C() : null;
            } else {
                this.f.addAllMessages(aa.j);
            }
        }
        if (aa.j()) {
            this.l(aa.k());
        }
        this.b(Aa.b(aa));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        if (!this.b()) {
            return false;
        }
        if (!this.j()) {
            return false;
        }
        for (n = 0; n < this.f(); ++n) {
            if (this.a(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.i(); ++n) {
            if (this.c(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public Ac a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        Aa aa = null;
        try {
            aa = (Aa)Aa.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            aa = (Aa)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (aa != null) {
                this.a(aa);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public Ac e(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public Ac q() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    private void z() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList<Ai>(this.c);
            this.a |= 2;
        }
    }

    @Override
    public List<Ai> d() {
        if (this.d == null) {
            return Collections.unmodifiableList(this.c);
        }
        return this.d.getMessageList();
    }

    @Override
    public int f() {
        if (this.d == null) {
            return this.c.size();
        }
        return this.d.getCount();
    }

    @Override
    public Ai a(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (Ai)this.d.getMessage(n);
    }

    public Ac a(int n, Ai ai) {
        if (this.d == null) {
            if (ai == null) {
                throw new NullPointerException();
            }
            this.z();
            this.c.set(n, ai);
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)ai);
        }
        return this;
    }

    public Ac a(int n, Ak ak) {
        if (this.d == null) {
            this.z();
            this.c.set(n, ak.l());
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)ak.l());
        }
        return this;
    }

    public Ac a(Ai ai) {
        if (this.d == null) {
            if (ai == null) {
                throw new NullPointerException();
            }
            this.z();
            this.c.add(ai);
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)ai);
        }
        return this;
    }

    public Ac b(int n, Ai ai) {
        if (this.d == null) {
            if (ai == null) {
                throw new NullPointerException();
            }
            this.z();
            this.c.add(n, ai);
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)ai);
        }
        return this;
    }

    public Ac a(Ak ak) {
        if (this.d == null) {
            this.z();
            this.c.add(ak.l());
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)ak.l());
        }
        return this;
    }

    public Ac b(int n, Ak ak) {
        if (this.d == null) {
            this.z();
            this.c.add(n, ak.l());
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)ak.l());
        }
        return this;
    }

    public Ac a(Iterable<? extends Ai> iterable) {
        if (this.d == null) {
            this.z();
            AbstractMessageLite.Builder.addAll(iterable, this.c);
            this.onChanged();
        } else {
            this.d.addAllMessages(iterable);
        }
        return this;
    }

    public Ac r() {
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.d.clear();
        }
        return this;
    }

    public Ac f(int n) {
        if (this.d == null) {
            this.z();
            this.c.remove(n);
            this.onChanged();
        } else {
            this.d.remove(n);
        }
        return this;
    }

    public Ak g(int n) {
        return (Ak)this.A().getBuilder(n);
    }

    @Override
    public Al b(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (Al)this.d.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends Al> e() {
        if (this.d != null) {
            return this.d.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.c);
    }

    public Ak s() {
        return (Ak)this.A().addBuilder((AbstractMessage)Ai.m());
    }

    public Ak h(int n) {
        return (Ak)this.A().addBuilder(n, (AbstractMessage)Ai.m());
    }

    public List<Ak> t() {
        return this.A().getBuilderList();
    }

    private RepeatedFieldBuilderV3<Ai, Ak, Al> A() {
        if (this.d == null) {
            this.d = new RepeatedFieldBuilderV3(this.c, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    private void B() {
        if ((this.a & 4) != 4) {
            this.e = new ArrayList<Ai>(this.e);
            this.a |= 4;
        }
    }

    @Override
    public List<Ai> g() {
        if (this.f == null) {
            return Collections.unmodifiableList(this.e);
        }
        return this.f.getMessageList();
    }

    @Override
    public int i() {
        if (this.f == null) {
            return this.e.size();
        }
        return this.f.getCount();
    }

    @Override
    public Ai c(int n) {
        if (this.f == null) {
            return this.e.get(n);
        }
        return (Ai)this.f.getMessage(n);
    }

    public Ac c(int n, Ai ai) {
        if (this.f == null) {
            if (ai == null) {
                throw new NullPointerException();
            }
            this.B();
            this.e.set(n, ai);
            this.onChanged();
        } else {
            this.f.setMessage(n, (AbstractMessage)ai);
        }
        return this;
    }

    public Ac c(int n, Ak ak) {
        if (this.f == null) {
            this.B();
            this.e.set(n, ak.l());
            this.onChanged();
        } else {
            this.f.setMessage(n, (AbstractMessage)ak.l());
        }
        return this;
    }

    public Ac b(Ai ai) {
        if (this.f == null) {
            if (ai == null) {
                throw new NullPointerException();
            }
            this.B();
            this.e.add(ai);
            this.onChanged();
        } else {
            this.f.addMessage((AbstractMessage)ai);
        }
        return this;
    }

    public Ac d(int n, Ai ai) {
        if (this.f == null) {
            if (ai == null) {
                throw new NullPointerException();
            }
            this.B();
            this.e.add(n, ai);
            this.onChanged();
        } else {
            this.f.addMessage(n, (AbstractMessage)ai);
        }
        return this;
    }

    public Ac b(Ak ak) {
        if (this.f == null) {
            this.B();
            this.e.add(ak.l());
            this.onChanged();
        } else {
            this.f.addMessage((AbstractMessage)ak.l());
        }
        return this;
    }

    public Ac d(int n, Ak ak) {
        if (this.f == null) {
            this.B();
            this.e.add(n, ak.l());
            this.onChanged();
        } else {
            this.f.addMessage(n, (AbstractMessage)ak.l());
        }
        return this;
    }

    public Ac b(Iterable<? extends Ai> iterable) {
        if (this.f == null) {
            this.B();
            AbstractMessageLite.Builder.addAll(iterable, this.e);
            this.onChanged();
        } else {
            this.f.addAllMessages(iterable);
        }
        return this;
    }

    public Ac u() {
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.f.clear();
        }
        return this;
    }

    public Ac i(int n) {
        if (this.f == null) {
            this.B();
            this.e.remove(n);
            this.onChanged();
        } else {
            this.f.remove(n);
        }
        return this;
    }

    public Ak j(int n) {
        return (Ak)this.C().getBuilder(n);
    }

    @Override
    public Al d(int n) {
        if (this.f == null) {
            return this.e.get(n);
        }
        return (Al)this.f.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends Al> h() {
        if (this.f != null) {
            return this.f.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.e);
    }

    public Ak v() {
        return (Ak)this.C().addBuilder((AbstractMessage)Ai.m());
    }

    public Ak k(int n) {
        return (Ak)this.C().addBuilder(n, (AbstractMessage)Ai.m());
    }

    public List<Ak> w() {
        return this.C().getBuilderList();
    }

    private RepeatedFieldBuilderV3<Ai, Ak, Al> C() {
        if (this.f == null) {
            this.f = new RepeatedFieldBuilderV3(this.e, (this.a & 4) == 4, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.e = null;
        }
        return this.f;
    }

    @Override
    public boolean j() {
        return (this.a & 8) == 8;
    }

    @Override
    public int k() {
        return this.g;
    }

    public Ac l(int n) {
        this.a |= 8;
        this.g = n;
        this.onChanged();
        return this;
    }

    public Ac x() {
        this.a &= 0xFFFFFFF7;
        this.g = 0;
        this.onChanged();
        return this;
    }

    public final Ac a(UnknownFieldSet unknownFieldSet) {
        return (Ac)super.setUnknownFields(unknownFieldSet);
    }

    public final Ac b(UnknownFieldSet unknownFieldSet) {
        return (Ac)super.mergeUnknownFields(unknownFieldSet);
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
        return this.l();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.p();
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
        return this.l();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.p();
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
        return this.p();
    }

    public /* synthetic */ Message buildPartial() {
        return this.o();
    }

    public /* synthetic */ Message build() {
        return this.n();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.o();
    }

    public /* synthetic */ MessageLite build() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Object clone() {
        return this.p();
    }
}

