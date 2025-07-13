from django.http import HttpResponse
from django.template import loader

def home(request):
    temp=loader.get_template('form.html')
    return HttpResponse(temp.render())

# Create your views here.
