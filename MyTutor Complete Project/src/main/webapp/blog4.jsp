<jsp:include page="blog_header.jsp"></jsp:include>
<%

if(session.getAttribute("name")==null)
{
	response.sendRedirect("logout.jsp");
}

%>
		
		</header>
		<div class="inbt">
		Accelerate your career with Computer Science programs
	    </div>
        
	<div class="ccard">
	<center>
		<div class="ccardbox">
			<div class="dcard">
				<div class="fpart"><img src="images/courses/dbms.png"></div>
				<a href="#dbms"><div class="spart">Courses <img src="images/courses/dropdown.png"></div></a>
			</div>		
			
			</div>
	</div>
	
	<!--  on Databases -->

	<div class="title2" id="dbms">
		<span>Start Programming Databases </span>
		<div class="shortdesc2">
			<p>Store your useful Datas here..</p>
		</div>
	</div>
	<center>
		<div class="ccardbox2">
			<div class="dcard2"><span class="tag" >1/8</span>
				<a href="images/courses/blogs/db1.png"><div class="fpart2"><img src="images/courses/blogs/db1.png">
			</div></a>
			</div>
			<div class="dcard2"><span class="tag" >2/8</span>
				<a href="images/courses/blogs/db2.png"><div class="fpart2"><img src="images/courses/blogs/db2.png">
			</div></a>
			</div>
			<div class="dcard2"><span class="tag" >3/8</span>
				<a href="images/courses/blogs/db3.png"><div class="fpart2"><img src="images/courses/blogs/db3.png">
			</div></a>
			</div>
			<div class="dcard2"><span class="tag" >4/8</span>
				<a href="images/courses/blogs/db4.png"><div class="fpart2"><img src="images/courses/blogs/db4.png">
			</div></a>
			</div>
		
			<div class="dcard2"><span class="tag" >5/8</span>
				<a href="images/courses/blogs/db5.png"><div class="fpart2"><img src="images/courses/blogs/db5.png">
			</div></a>
			</div>
			<div class="dcard2"><span class="tag" >6/8</span>
				<a href="images/courses/blogs/db6.png"><div class="fpart2"><img src="images/courses/blogs/db6.png">
			</div></a>
			</div>
			<div class="dcard2"><span class="tag" >7/8</span>
				<a href="images/courses/blogs/db7.png"><div class="fpart2"><img src="images/courses/blogs/db7.png">
			</div></a>
			</div>
			<div class="dcard2"><span class="tag" >8/8</span>
				<a href="images/courses/blogs/db8.png"><div class="fpart2"><img src="images/courses/blogs/db8.png" >
			</div></a>
			</div>
		</div>
	</center>
	</br>
</body>
</html>