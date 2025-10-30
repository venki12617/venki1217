from django.shortcuts import render

# Create your views here.
from django.shortcuts import render, redirect
from django.contrib.auth import authenticate, login
from django.contrib.auth.forms import AuthenticationForm
from django.contrib import messages
from .forms import SignUpForm
from .models import Profile

def signup_view(request):
    if request.method == 'POST':
        form = SignUpForm(request.POST)
        if form.is_valid():
            user = form.save(commit=False)
            user.set_password(form.cleaned_data['password'])
            user.save()
            Profile.objects.create(
                user=user,
                phone=form.cleaned_data['phone'],
                role=form.cleaned_data['role']
            )
            messages.success(request, "Account created successfully! Please log in.")
            return redirect('login')
    else:
        form = SignUpForm()
    return render(request, 'hostel/signup.html', {'form': form})

def login_view(request):
    if request.method == 'POST':
        form = AuthenticationForm(request, data=request.POST)
        if form.is_valid():
            username = form.cleaned_data.get('username')
            password = form.cleaned_data.get('password')
            user = authenticate(username=username, password=password)
            if user is not None:
                login(request, user)
                profile = Profile.objects.get(user=user)
                if profile.role == 'warden':
                    return redirect('warden_dashboard')
                else:
                    return redirect('student_dashboard')
        messages.error(request, "Invalid username or password.")
    else:
        form = AuthenticationForm()
    return render(request, 'hostel/login.html', {'form': form})
