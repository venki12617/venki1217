from django.urls import path
from django.shortcuts import render
from . import views

urlpatterns = [
    path('signup/', views.signup_view, name='signup'),
    path('login/', views.login_view, name='login'),
    path('warden/dashboard/', lambda request: render(request, 'hostel/warden_dashboard.html'), name='warden_dashboard'),
    path('student/dashboard/', lambda request: render(request, 'hostel/student_dashboard.html'), name='student_dashboard'),
]